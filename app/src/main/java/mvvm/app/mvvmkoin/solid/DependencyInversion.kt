package mvvm.app.mvvmkoin.solid

//Dependency Inversion
/*

//high level module
class ProductCatalog{
    fun listAllProducts(){
        val sql = SQLProductRepo().getAllProduct()
        sql.forEach{
            println(it.toString())
        }
    }
}

//low level module
class SQLProductRepo{
    fun getAllProduct():MutableList<String> = mutableListOf("Apple","Banana")
}

//this code is couple code

*/


interface ProductRepo {
    fun getAllProduct(): MutableList<String>
}

class FruitProductRepo : ProductRepo {
    override fun getAllProduct(): MutableList<String> = mutableListOf("Apple", "Banana")
}

class ClothProductRepo : ProductRepo {
    override fun getAllProduct(): MutableList<String> = mutableListOf("Shirt", "T-Shirt")
}

class ProductCatalog {
    fun listAllProduct() {
        val sql: ProductRepo = FruitProductRepo()
        sql.getAllProduct().forEach { println(it) }

        val sql2:ProductRepo = ClothProductRepo()
        sql2.getAllProduct().forEach{ println(it) }
    }

}

fun main() {
    val p =ProductCatalog()
    p.listAllProduct()
}