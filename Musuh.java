public static
class Musuh extends Karakter {
        public
Musuh(String namaKarakter, String ras, Senjata senjata, BajuBesi bajuBesi) {
            super(namaKarakter,
ras, senjata, bajuBesi);
        }
 
        @Override
        public
void serang(Karakter target) {
            int
damage = senjata.getDampak();
            target.currentHP
-= damage;
        }
 
        @Override
        public
void gunakanKeterampilan(Karakter target, int biayaMP) {
            //
Musuh tidak menggunakan keterampilan dalam contoh ini
        }
 
        @Override
        protected
int hitungMaxHP() {
            //
Perhitungan HP maksimum Musuh
            return
100;
        }
 
        @Override
        protected
int hitungMaxMP() {
            //
Perhitungan MP maksimum Musuh
            return
50;
        }
    }
}