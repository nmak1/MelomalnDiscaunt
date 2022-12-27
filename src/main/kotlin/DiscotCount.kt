
class DiscotCount {

    companion object {

        fun DiscontCount(Purchase_Amount: Int, isOftenBuyer: Boolean): Int {
            var discont = 0
            if (Purchase_Amount > 1000 && Purchase_Amount <= 10000) discont = 100
            if (Purchase_Amount > 10000) discont = (Purchase_Amount * 5) / 100
            var dicontBuyer = 0
            if (isOftenBuyer) dicontBuyer = (Purchase_Amount - discont) * 1 / 100
            return discont + dicontBuyer

        }
    }
}