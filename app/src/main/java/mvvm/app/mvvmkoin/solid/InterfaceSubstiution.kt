package mvvm.app.mvvmkoin.solid
/*
// this whole functionality in one modal
//that ois not interface substitution principle

interface IMultiFunctional{
    fun print()
    fun printDetails()
    fun scan()
    fun scanPhoto()
    fun fax()
    fun internetFax()
}

class Machine:IMultiFunctional {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun internetFax() {
        TODO("Not yet implemented")
    }
} */

//applied principle


interface PrinterFunctional {
    fun print()
    fun printDetails()
}

interface ScannerFunctional {
    fun scan()
    fun scanPhoto()
}

interface FaxFunctional {
    fun fax()
    fun internetFax()
}



class FaxMachine: FaxFunctional {
    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun internetFax() {
        TODO("Not yet implemented")
    }

}

class SmartPrinterMachine:PrinterFunctional,ScannerFunctional{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printDetails() {
        TODO("Not yet implemented")
    }

    override fun scan() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

}

class PrinterMachine:PrinterFunctional{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printDetails() {
        TODO("Not yet implemented")
    }

}