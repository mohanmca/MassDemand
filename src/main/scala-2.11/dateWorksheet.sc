object dateWorksheet {
  import io.lamma._
  val date = Date(2014, 7, 5)                     //> date  : io.lamma.Date = Date(2014,7,5)
  date == Date("2014-07-05")                      //> res0: Boolean = true
}