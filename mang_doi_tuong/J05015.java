    import java.util.*;
    class XD{
        private String hoten;
        private String donvi;
        private String thoidiem;

        public XD(){
            hoten = "";
            donvi = "";
            thoidiem = "";
        }
        
        public double doigio(){
            String[] p = thoidiem.trim().split(":");
            int gio = Integer.parseInt(p[0].trim());
            int phut = Integer.parseInt(p[1].trim());
            return gio + phut / 60.0;

        }
        public double thoigian(){
            return doigio() - 6.0;
        }
        public long thanhtich() {
            return Math.round(120.0 / thoigian());
        }
        public String ghep(String s){
            String[] tu = s.trim().toUpperCase().split("\\s+");
            String res = "";
            for (String w:tu){
                res+=w.charAt(0);
            }
            return res;
        }
        public String kq(){
            return ghep(donvi) + ghep(hoten);
        }
        public void nhap(Scanner sc){
            hoten = sc.nextLine().trim();
            donvi = sc.nextLine().trim();
            thoidiem = sc.nextLine().trim();
        }
        @Override
        public String toString(){
            return kq() + " " + hoten +" " + donvi + " " + thanhtich() +" Km/h";
        }
    }
    public class J05015{
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);
            ArrayList<XD>  ds = new ArrayList();
            int n = Integer.parseInt(sc.nextLine().trim());
            for(int i=0;i<n;i++){
                XD nv = new XD();
                nv.nhap(sc);
                ds.add(nv);
            }
            ds.sort((a, b) -> Double.compare(a.thoigian(), b.thoigian()));
            for(XD nv : ds){
                System.out.println(nv);
            }
            sc.close();
        }
    }