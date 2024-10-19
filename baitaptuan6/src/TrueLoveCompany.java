import java.util.HashSet;
import java.util.Random;

public class TrueLoveCompany {
    public static void main(String[] args) {
        // Tạo một HashSet để lưu trữ tên các nhân viên
        HashSet<String> danhSachNhanVien = new HashSet<>();

        // Thêm tên nhân viên vào danh sách
        danhSachNhanVien.add("Nguyen Van A");
        danhSachNhanVien.add("Tran Thi B");
        danhSachNhanVien.add("Le Van C");
        danhSachNhanVien.add("Pham Thi D");

        // Chọn ngẫu nhiên một nhân viên
        String[] arrNhanVien = danhSachNhanVien.toArray(new String[0]);
        Random rand = new Random();
        String nhanVienDuocChon = arrNhanVien[rand.nextInt(arrNhanVien.length)];

        // In ra tên nhân viên được chọn
        System.out.println("Nhân viên được chọn để nhận quà: " + nhanVienDuocChon);
    }
}
