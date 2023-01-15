class Employee {
    val id: Int
    val name: String
    val salary: Double

    constructor(id: Int, name: String, salary: Double) {
        this.id = id
        this.name = name
        this.salary = salary
    }

    fun printDetails() {
        println("Employee ID: $id")
        println("Employee name: $name")
        println("Employee salary: $salary")
    }
}
