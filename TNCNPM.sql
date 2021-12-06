USE master
GO

IF(EXISTS(SELECT * FROM SYSDATABASES WHERE NAME='TracNghiemCNPM'))
	DROP DATABASE TracNghiemCNPM

CREATE DATABASE TracNghiemCNPM
GO

USE TracNghiemCNPM
GO

CREATE TABLE Account(
	Account_ID INT IDENTITY PRIMARY KEY, --khoá chính tự tăng
	UserName NCHAR(50),
	PassWord NCHAR(200),
	Name NVARCHAR(50),
	Roles BIT DEFAULT 0, --1 : TK Admin, 0 : TK Student
	Status BIT DEFAULT 1, --1 : Đã được kích hoạt, 0 : Bị vô hiệu hóa
)
GO

CREATE TABLE Chapter(
	Chapter_ID INT IDENTITY PRIMARY KEY,
	Chapter INT, --Chương thứ mấy
	Chapter_Name NVARCHAR(100)
)
GO

CREATE TABLE Lesson(
	Lesson_ID INT IDENTITY PRIMARY KEY,
	Lesson INT, --Bài thứ mấy
	Lesson_Name NVARCHAR(100),
	Chapter_ID INT FOREIGN KEY REFERENCES Chapter(Chapter_ID) ON UPDATE CASCADE ON DELETE CASCADE
)
GO

CREATE TABLE Level(
	Level_ID INT IDENTITY PRIMARY KEY,
	Level_Name NVARCHAR(20) -- Dễ Trung Bình Khó
)
GO

CREATE TABLE Question(
	Question_ID INT IDENTITY PRIMARY KEY,
	Question NVARCHAR(200),
	Level_ID INT FOREIGN KEY REFERENCES Level(Level_ID) ON UPDATE CASCADE ON DELETE CASCADE,
	Lesson_ID INT FOREIGN KEY REFERENCES Lesson(Lesson_ID) ON UPDATE CASCADE ON DELETE CASCADE
)
GO

CREATE TABLE Answer (
	Answer_ID INT IDENTITY PRIMARY KEY,
	Answer NVARCHAR(200),
	Correct BIT, --1 là đúng, 0 là sai
	Question_ID INT FOREIGN KEY REFERENCES Question(Question_ID) ON UPDATE CASCADE ON DELETE CASCADE
)
GO

CREATE TABLE Test(
	Test_ID INT IDENTITY PRIMARY KEY,
	Test_Name NVarCHAR(200), --tên đề
	Time INT, --Thời gian làm đề. Tính là phút, nếu thời gian dài hơn sẽ làm hàm convert ở phía xử lý code.
	Level_ID INT FOREIGN KEY REFERENCES Level(Level_ID) ON UPDATE CASCADE ON DELETE CASCADE,
	Status BIT DEFAULT 1 --1 : Đã được kích hoạt, 0 : Bị vô hiệu hóa
)
GO

CREATE TABLE Test_Question(
	T_QT_ID INT IDENTITY PRIMARY KEY,
	Test_ID INT FOREIGN KEY REFERENCES Test(Test_ID) ,
	Question_ID INT FOREIGN KEY REFERENCES Question(Question_ID) ON UPDATE CASCADE ON DELETE CASCADE
)
GO

CREATE TABLE Result(
	Result_ID INT IDENTITY PRIMARY KEY,
	Account_ID INT FOREIGN KEY REFERENCES Account(Account_ID) ,
	Test_ID INT FOREIGN KEY REFERENCES Test(Test_ID) ,
	Time INT, --Thời gian làm bài = Thời gian làm đề - Thời gian còn lại
	Correct_QT int, --Số cấu TL đúng => Tính điểm = số câu đúng / số câu trong đề (Correct_QT / Number_Of_Question)
	Result_Date DATE,
	Mark float
)

GO


INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'admin', N'admin', N'Vũ Thị Dương', 1, 1)
INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'2018600523', N'123456', N'Nguyễn Viết Lộc', 0, 1)
INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'2018600001', N'123456', N'Phạm Đức Linh', 0, 1)
INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'2018600002', N'123456', N'Đoàn Văn Linh', 0, 1)
INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'2018600003', N'123456', N'Đặng Hoàng Lâm', 0, 1)
INSERT [dbo].[Account] ([UserName], [PassWord], [Name], [Roles], [Status]) VALUES (N'2018600004', N'123456', N'Nguyễn Duy Khánh', 0, 1)

GO
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (1, N'Tổng quan về công nghệ phần mềm')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (2, N'Phân tích và đặc tả yêu cầu')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (3, N'Thiết kế phần mềm')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (4, N'Thiết kế dữ liệu')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (5, N'Thiết kế giao diện')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (6, N'Cài đặt')
INSERT [dbo].[Chapter] ([Chapter], [Chapter_Name]) VALUES (7, N'Kiểm thử phầm mềm')

GO

INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Các khái niệm cơ bản', 1)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Quy trình công nghệ phần mềm',1)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Các phương pháp xây dựng phần mềm', 1)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (4, N'Công cụ và môi trường phát triển phần mềm', 1)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan', 2)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Mô hình hóa yêu cầu hệ thống', 2)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan về thiết kế', 3)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Kiến trúc phần mềm', 3)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Phương pháp thiết kế phần mềm', 3)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Kết quả của thiết kế', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Quá trình thiết kế', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (4, N'Phương pháp thiết kế dữ liệu', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (5, N'Thiết kế dữ liệu với tính đúng đắn', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (6, N'Thiết kế dữ liệu và yêu cầu chất lượng', 4)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan', 5)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Thiết kế màn hình', 5)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Thiết kế màn hình tra cứu', 5)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (4, N'Thiết kế màn hình nhập liệu', 5)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan', 6)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Môi trường lập trình', 6)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Phong cách lập trình', 6)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (4, N'Đánh giá chất lượng công việc', 6)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (1, N'Tổng quan', 7)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (2, N'Yêu cầu đối với kiểm thử', 7)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (3, N'Các kỹ thuật kiểm thử', 7)
INSERT [dbo].[Lesson] ([Lesson], [Lesson_Name], [Chapter_ID]) VALUES (4, N'Các giai đoạn và chiến lược kiểm thử', 7)

GO

INSERT [dbo].[Level] ([Level_Name]) VALUES (N'Dễ')
INSERT [dbo].[Level] ([Level_Name]) VALUES (N'Trung Bình')
INSERT [dbo].[Level] ([Level_Name]) VALUES (N'Khó')

GO

INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Quá trình tiến hóa của phần mềm được chia thành mấy giai đoạn', 1, 1)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Phần mềm được thể hiện với các bộ phận cấu thành, đó là', 1, 1)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Đâu là đặc trưng của phần mềm', 2, 1)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Có mấy cách phân loại phần mềm theo lĩnh vực phục vụ:', 1, 1)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Có mấy vấn đề liên quan đến CNPM:', 1, 1)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Tập hợp các hành hộng nhằm xây dựng và phát triển phần mềm gồm:', 2, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Câu: “Mềm dẻo, có khả năng thích nghi cho việc phát triển tiếp” xuất hiện ở mục:', 1, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Đặc trưng thời kỳ những năm 1960 đến giữa những năm 1970:', 2, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Kỹ nghệ phần mềm là kỹ nghệ phát triển một hệ thống gồm các bước chủ chốt sau:', 1, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Có mấy loại thành phần của phần mềm:', 1, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Mô hình thác nước có bao nhiêu pha?', 2, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Có bao nhiêu dạng và phương pháp thực hiện mô hình bản mẫu?', 2, 2)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Mô hình xoắn gồm những bước nào sau đây?', 3, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Mô hình RUP là:', 1, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Phương pháp ứng dụng nhanh RAD:', 2, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Phát triển HT hình thức hóa gồm các bước:', 1, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Các trạng thái chính trong mô hình hướng thành phần gồm:', 3, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Ưu điểm nào không phải là của phương pháp hướng dữ liệu?', 1, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Tính chất nào sau đây không phải của phương pháp hướng đối tượng?', 3, 3)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'Môi trường CASE gồm:', 3, 4)
INSERT [dbo].[Question] ([Question], [Level_ID], [Lesson_ID]) VALUES (N'CASE có bao nhiêu loại?', 1, 4)

GO

INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'2', 0, 1)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4', 1, 1)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5', 0, 1)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'6', 0, 1)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Tập lệnh, các tài liệu kĩ thuật liên quan.', 0, 2)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Lập lệnh, cấu trúc dữ liệu.', 0, 2)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Tập lệnh, cấu trúc dữ liệu và các tài liệu liên quan.', 1, 2)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Cấu trúc dữ liệu và các tài liệu liên quan.', 0, 2)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Sự tăng quy mô của phần mềm.', 0, 3)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Khả năng bảo trì hệ thống phần mềm cũ tồn tại khó khăn và chi phí lớn.', 0, 3)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phần mềm là hệ thống logic, không phải là hệ thống vật lý.', 0, 3)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Quy mô và độ phức tạp của PM ngày càng tăng.', 1, 3)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'9', 1, 4)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'7', 0, 4)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5', 0, 4)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3', 0, 4)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'7', 1, 5)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'8', 0, 5)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'9', 0, 5)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'10', 0, 5)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đặc tả, phát triển, kiểm thử và mở rộng.', 1, 6)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đặc tả, kiểm thử, phát triển và mở rộng.', 0, 6)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đặc tả, phát triển, mở rộng và kiểm thử.', 0, 6)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đăc tả, kiểm thử, mở rộng và phát triển.', 0, 6)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Kiến trúc phần mềm.', 0, 7)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phân loại phần mềm.', 0, 7)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đặc trưng phần mềm.', 1, 7)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Tiêu chuẩn phần mềm.', 0, 7)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Hệ thống thời gian thực.', 0, 8)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phát triển mạng toàn cục và cục bộ, truyền thông tín hiệu số giải thông cao', 0, 8)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Các hệ thống đa nhiệm, đa người dùng.', 0, 8)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Hệ thống thời gian thực và Các hệ thống đa nhiệm, đa người dùng.', 1, 8)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phương pháp', 0, 9)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Công cụ', 0, 9)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Thủ tục', 0, 9)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Cả 3 đáp án', 1, 9)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'2', 0, 10)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3', 0, 10)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4', 1, 10)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5', 0, 10)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3', 0, 11)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4', 0, 11)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5', 0, 11)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'6', 1, 11)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'2 dạng và 3 phương pháp ', 0, 12)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3 dạng và 2 phương pháp ', 1, 12)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3 dạng và 4 phương pháp ', 0, 12)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4 dạng và 3 phương pháp ', 0, 12)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4 bước: Thiết lập mục tiêu – Đánh giá và giảm thiểu rủ do – Phát triển và đánh giá -  Lập kế hoạch.', 0, 13)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3 bước: Thiết lập mục tiêu – Đánh giá và giảm thiểu rủ do – Lập kế hoạch.', 0, 13)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5 bước: Thiết lập mục tiêu – Đánh giá và giảm thiểu rủ do – Phát triển và đánh giá -  Lập kế hoạch – Triển khai.', 0, 13)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'2 bước: Thiết lập mục tiêu - Lập kế hoạch. ', 1, 13)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Mô hình chung cho hướng đối tượng.', 1, 14)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Mô hình riêng cho hướng đối tượng.', 0, 14)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Mô hình chung cho hướng thành phần.', 0, 14)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Mô hình riêng cho hướng thành phần', 0, 14)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Là phương pháp luận gộp các HĐ phân tích, thiết kế, xây dựng và một loạt vòng lặp phát triển ngắn. ', 0, 15)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Là phương pháp luận gộp các HĐ phân tích, thiết kế, xây dựng vào một loạt vòng lặp phát triển dài.', 1, 15)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Là phương pháp luận gộp các HĐ phân tích, thiết kế, xây dựng vào một loạt vòng lặp phát triển ngắn. ', 0, 15)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Là phương pháp luận gồm các HĐ phân tích, thiết kế, xây dựng vào một loạt vòng lặp phát triển ngắn. ', 0, 15)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Xác định yêu cầu – Biến đổi hình thức – Đặc tả hình thức – Kiểm thử tích hợp và hệ thống.', 0, 16)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Xác định yêu cầu – Đặc tả hình thức – Biến đổi hình thức – Kiểm thử tích hợp và hệ thống.', 1, 16)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Xác định yêu cầu – Kiểm thử tích hợp và hệ thống – Đặc tả hình thức -Biến đổi hình thức.', 0, 16)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Xác định yêu cầu – Kiểm thử tích hợp và hệ thống – Đặc tả hình thức.', 0, 16)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phân tích thành phần sẵn có - Điều chỉnh yêu cầu - Thiết kế hệ thống với kỹ thuật tái sử dụng- Xây dựng và tích hợp hệ thống.', 0, 17)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Điều chỉnh yêu cầu - Thiết kế hệ thống với kỹ thuật tái sử dụng- Xây dựng và tích hợp hệ thống.', 0, 17)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phân tích thành phần sẵn có - Điều chỉnh yêu cầu - Xây dựng và tích hợp hệ thống.', 0, 17)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Phân tích thành phần sẵn có - Điều chỉnh yêu cầu - Thiết kế hệ thống với kỹ thuật tái sử dụng- Xây dựng và tích hợp hệ thống – Bảo trì và nâng cấp ', 1, 17)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Cho phép quản lý dữ liệu tập trung, nhất quán. ', 0, 18)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Sử dụng được cho nhiều ứng dụng độc lập khác nhau. ', 0, 18)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Dễ dàng áp dụng các công cụ toán học để xử lý dữ liệu. ', 1, 18)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Chuẩn hóa tạo ra sự độc lập.', 0, 18)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Bao gói thông tin', 0, 19)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đơn hình ', 1, 19)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Kế thừa ', 0, 19)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Đa hình', 0, 19)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Một kho chứa - Công cụ đồ họa - Phần mềm soạn thảo văn bản - Phần mềm giao diện kho chứa - Phần mềm đánh giá - Giao diện người sử dụng.', 0, 20)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Một kho chứa - Phần mềm giao diện kho chứa - Phần mềm đánh giá - Giao diện người sử dụng.', 1, 20)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Một kho chứa - Công cụ đồ họa - Phần mềm soạn thảo văn bản - Phần mềm giao diện kho - Giao diện người sử dụng.', 0, 20)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'Một kho chứa - Công cụ đồ họa - Phần mềm soạn thảo văn bản - Giao diện người sử dụng.', 0, 20)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'2', 0, 21)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'3', 0, 21)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'4', 1, 21)
INSERT [dbo].[Answer] ([Answer], [Correct], [Question_ID]) VALUES (N'5', 0, 21)

GO

INSERT [dbo].[Test] ([Test_Name], [Time], [Level_ID], [Status]) VALUES (N'Đề kiểm tra CNTT1 Chương 1', 10, 2, 1)
INSERT [dbo].[Test] ([Test_Name], [Time], [Level_ID], [Status]) VALUES (N'Đề kiểm tra HTTT1 Chương 1', 8, 1, 1)
INSERT [dbo].[Test] ([Test_Name], [Time], [Level_ID], [Status]) VALUES (N'Đề kiểm tra KHMT2 Chương 1', 12, 2, 1)
INSERT [dbo].[Test] ([Test_Name], [Time], [Level_ID], [Status]) VALUES (N'Đề kiểm tra KTPM1 Chương 1', 8, 2, 1)

GO

INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 1)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 2)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 3)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 4)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 5)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 6)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 7)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 8)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 9)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 14)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 15)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (1, 17)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 3)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 5)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 6)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 7)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 8)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 21)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 20)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 13)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 15)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (2, 11)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 19)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 18)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 17)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 16)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 3)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 4)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 5)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 6)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 7)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 8)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 9)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 10)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 11)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 12)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 13)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (3, 14)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 1)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 2)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 3)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 4)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 19)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 18)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 17)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 16)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 15)
INSERT [dbo].[Test_Question] ([Test_ID], [Question_ID]) VALUES (4, 14)

GO
--PROC Get List Question By Id Test
CREATE PROC STP_GetQuestionByIdTest
@IdTest INT
AS 
BEGIN
	SELECT Q.Question_ID, Q.Question, Q.Level_ID, Q.Lesson_ID
	FROM Test_Question AS TQ,Question AS Q
	WHERE TQ.Question_ID = Q.Question_ID
	AND TQ.Test_ID = @IdTest
END

--EXEC STP_GetQuestionByIdTest 1
--DROP PROC STP_GetQuestionByIdTest
GO

--PROC Get List Question By Level
CREATE PROC STP_GetQuestionByLevel
@level INT
AS 
BEGIN
	SELECT Q.Question_ID, Q.Question, Q.Level_ID, Q.Lesson_ID
	FROM Level as L,Question AS Q
	WHERE L.Level_ID = Q.Level_ID
	AND Q.Level_ID = @level
END

--EXEC STP_GetQuestionByLevel 1
--DROP PROC STP_GetQuestionByLevel
GO


--Proc get questions by chapter and lesson
CREATE PROC GetQuestionsByChapterLesson
@chapter INT,
@lesson INT,
@level INT
AS
BEGIN
	SELECT * 
	FROM Chapter AS C, LESSON AS L, Question AS Q
	WHERE C.Chapter_ID = L.Chapter_ID
	AND L.Lesson_ID = Q.Lesson_ID
	AND C.Chapter = @chapter
	AND L.Lesson = @lesson
	AND Q.Level_ID = @level
END

--EXEC GetQuestionsByChapterLesson 2,1,2
--DROP PROC GetQuestionsByChapterLesson
GO

--Proc Edit Test by IdTest
Create Proc EditTestById
@idTest INT,
@testCode NVarCHAR(200),
@time INT
AS
BEGIN
	UPDATE Test 
	SET Test_Name = @testCode,TIME = @time
	WHERE Test_ID = @idTest
END

--EXEC EditTestById 1,N'Edited',3
--DROP PROC EditTestById

SELECT Q.Question ,Q.Level_ID
FROM Question AS Q, Chapter AS C, Lesson AS L
WHERE Q.Lesson_ID = L.Lesson
AND L.Chapter_ID = C.Chapter
AND C.Chapter = 3
AND L.Lesson = 2

GO
--Get Chapter from TestID
CREATE PROC STP_GetChapterByTestID
@TestID INT
AS 
BEGIN
	Select * from Chapter where Chapter_ID = 
(Select top(1) Chapter_ID from Lesson
where Lesson_ID = (select top(1)Lesson_ID from Question
Where Question_ID = (select top (1) Question_ID from Test_Question where Test_ID = @TestID)))
END

GO

CREATE PROC STP_GetListQuestionByChapter @chapter int
AS
SELECT Q.Question_ID, Question, Level_ID, Q.Lesson_ID
FROM Question Q INNER JOIN Lesson L ON Q.Lesson_ID = L.Lesson_ID
WHERE Chapter_ID = @chapter

GO
CREATE PROC STP_GetListQuestionByChapterAndLevel @chapter int,@level int
AS
SELECT Q.Question_ID, Question, Level_ID, Q.Lesson_ID
FROM Question Q INNER JOIN Lesson L ON Q.Lesson_ID = L.Lesson_ID
WHERE Chapter_ID = @chapter And Level_ID = @level
