object dateWorksheet {
  import io.lamma._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  val date = Date(2014, 7, 5);System.out.println("""date  : io.lamma.Date = """ + $show(date ));$skip(29); val res$0 = 
  date == Date("2014-07-05");System.out.println("""res0: Boolean = """ + $show(res$0))}
}
