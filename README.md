# Ứng dụng Quản lý Trung tâm ngoại ngữ FLCenter v1.0

## Mô tả
   Ứng dụng giúp bạn theo dõi và quản lý trung tâm ngoại ngữ một cách hiệu quả và chặt chẽ.
### Ưu điểm:
   - Có sự liên kết cơ sở dữ liệu trong phần mềm. Mặc dù còn nhiều khó khăn do sử dụng CSDL file .xml, nhóm phát triển đã cố gắng tạo ra các sự liên kết giữa các CSDL với nhau, tạo nên sự đồng bộ cao giữa các chức năng của phần mềm.
   - Có hỗ trợ Tìm kiếm theo nhiều tiêu chí giúp dễ dàng tìm kiếm với nhiều thuộc tính khác nhau.
   - Phần đăng nhập có hỗ trợ Lưu mật khẩu để dễ dàng bỏ qua bước nhập mật khẩu khi đăng nhập.
### Nhược điểm
   - Do không sử dụng hệ CSDL như MySQL nên phần mềm chưa cho phép tạo/thay đổi tài khoản đăng nhập hệ thống cũng như phân quyền truy cập.
   - Do chưa có điều kiện tiếp xúc trực tiếp với thực tế công việc ở các trung tâm ngoại ngữ nên các chức năng vẫn mang tính demo là chính.

## Hướng dẫn sử dụng

### Đăng nhập
![Image alt text](images/loginmd.png)
  - Nhập đầy đủ thông tin đăng nhập từ nhà phát triển cung cấp
  - Tick chọn Remember password để ghi nhớ cho lần đăng nhập kế tiếp
  - Sign in để đăng nhập 

### Chức năng

![Image alt text](images/menumd.png)

#### Quản lý học viên
![Image alt text](images/QLHVmd.png)
  - Quản lý thông tin của toàn bộ học viên các lớp ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa, tìm kiếm thông tin học viên)
  - In thông tin của một học viên bất kì (PDF)
![Image alt text](images/printmd.png)

#### Quản lý môn học
![Image alt text](images/QLMHmd.png)
  - Quản lý thông tin của các môn học ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa, tìm kiếm thông tin môn học)

#### Quản lý kỳ thi
![Image alt text](images/QLKTmd.png)
  - Quản lý thông tin của các kỳ thi ( bao gồm việc sắp xếp , thêm , xóa, chỉnh sửa, tìm kiếm thông tin các kỳ thi)

#### Quản lý lớp học

##### Danh sách lớp học
![Image alt text](images/DSLHmd.png)
  - Quản lý số lượng của các lớp học  ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa số lượng học viên) và quản lý tất cả các lớp của trung tâm
  - Thống kê số lượng học viên theo lớp
![Image alt text](images/chart2md.png)


##### Quản lý học viên từng lớp
![Image alt text](images/QLHVTLmd.png)
  - Quản lý thông tin của các học viên theo từng lớp ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa, nhập điểm, tìm kiếm thông tin học viên)
  - Thống kê điểm số của từng lớp
![Image alt text](images/chart1md.png)
  - Từ đây, có thể lưu lại ảnh (nhấp chuột phải -> Copy / Save As)

### Quản lý tài liệu
![Image alt text](images/QLTLmd.png)
  - Quản lý thông tin của các tài liệu ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa, tìm kiếm thông tin tài liệu)


### Quản lý cán bộ
![Image alt text](images/QLCB2md.png)
  - Quản lý thông tin của toàn bộ cán bộ ( lãnh đạo và giảng viên ) của trung tâm ( bao gồm việc sắp xếp, thêm, xóa, chỉnh sửa, tìm kiếm thông tin cán bộ)


#### Đăng xuất
  - Trả về màn hình đăng nhập

#### About 
  - Thông tin về tác giả và các mã nguồn

## Cấu trúc Thư mục
- `java/`: Chứa mã nguồn của ứng dụng.
- `resources/`: Chứa các tài nguyên tĩnh như HTML, CSS và hình ảnh.

## Cấu trúc file đóng gói
- File đóng gọi dạng file zip, có thể tìm tháy ở phần Releases
- File đóng gói bao gồm 1 file chương trình .jar, 1 folder `conf/` chứa các file tĩnh, các file data .xml
- Lưu ý: Giải nén file đóng gói trước khi sử dụng. Sau khi giải nén, nhấn chọn file `flcenter-1.0.jar` để khởi động chương trình.

## Yêu cầu Hệ thống
- JDK 21 hoặc hơn.

## Tác giả và Giấy Phép
- Tác giả: Lê Thành Đạt - Đặng Quang Vinh
- Email: ltdatdz@gmail.com  - dqv.0212@gmail.com

## Trạng Thái Dự Án
- Dự án hiện đang được phát triển và không phải là phiên bản ổn định.
