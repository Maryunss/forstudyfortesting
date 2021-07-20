data class Guitar(
 val nameModel:String,
 val body:String,
 val fingerBoard:String,
 val scale:String,
 val pickup:String,
 val control:String,
 val bridge:String,
 val porozhek:String,
 val сolor:String,
 val frets:String
) {
 override fun toString(): String {
  return """
   Название модели: $nameModel
   Корпус: $body
   Гриф: $fingerBoard
   Мензура: $scale
   Звукосниматели: $pickup
   Бридж: $bridge
   Порожек: $porozhek
   Цвет: $сolor
   Ладов: $frets
   
 """.trimIndent()
 }
}





