package mvvm.app.mvvmkoin.solid

// open closed principle not applied
class VehicleInsuranceCustomer{
    fun isLoyalCustomer():Boolean=true
}
class HomeInsuranceCustomer{
    fun isLoyalCustomer():Boolean=true
}
class LifeInsuranceCustomer{
    fun isLoyalCustomer():Boolean=true
}

class InsuranceCompany{
    fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer):Int{
        return  if(vehicleInsuranceCustomer.isLoyalCustomer()) 10 else 7
    }
    fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer):Int{
        return  if(homeInsuranceCustomer.isLoyalCustomer()) 20 else 12
    }
    fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer):Int{
        return  if(lifeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }
}


// apply


interface  Customer{
    fun isLoyalCustomer():Boolean
}
class VehicleInsurance :Customer{
    override fun isLoyalCustomer(): Boolean =true
}
class HomeInsurance :Customer{
    override fun isLoyalCustomer(): Boolean=true
}
class LifeInsurance :Customer{
    override fun isLoyalCustomer(): Boolean=true
}

class IC{
    fun discountRate(customer: Customer):Int{
        return if (customer.isLoyalCustomer()) 38 else 20
    }
}

fun main() {
    val vehicleInsurance = VehicleInsurance()
    val homeInsurance = HomeInsurance()
    val lifeInsurance = LifeInsurance()

    val ic = IC()

    print(ic.discountRate(vehicleInsurance))
    print(ic.discountRate(homeInsurance))
    print(ic.discountRate(lifeInsurance))
}