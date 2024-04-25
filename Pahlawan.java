public static
class Pahlawan extends Karakter {
        private
int level;
 
        public
Pahlawan(String namaKarakter, String ras, Senjata senjata, BajuBesi bajuBesi,
int level) {
            super(namaKarakter,
ras, senjata, bajuBesi);
            this.level
= level;
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
            int
damage = biayaMP * level; // Contoh perhitungan kerusakan keterampilan
            target.currentHP
-= damage;
            currentMP
-= biayaMP;
        }
 
        @Override
        protected
int hitungMaxHP() {
            return
level * 10; // Contoh perhitungan HP maksimum berdasarkan level
        }
        @Override
        protected
int hitungMaxMP() {
            return
level * 5; // Contoh perhitungan MP maksimum berdasarkan level
        }
    }
}