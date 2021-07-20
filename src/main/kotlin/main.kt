fun main(args: Array<String>) {

    val guitars: Array<Guitar> = arrayOf(
        Guitar(
            nameModel = "Squier Affinity Series Stratocaster",
            body = "Тополь",
            fingerBoard = "Клён",
            scale = "25.5 мм",
            pickup = "Standard Single-Coil Strat (SSS)",
            control = "1 громкость, 2 тона, 5-ти позиционный переключатель звукоснимателей ",
            bridge = "6-Saddle Vintage-Style Synchronized Tremolo",
            porozhek = "Синтетическая кость 1.6” (40.6 мм)",
            сolor = "Brown Sunburst",
            frets = "21 Medium Jumbo"
        ),
        Guitar(
            nameModel = "EVH Wolfgang® WG Standard Maple Fingerboard Transparent Black",
            body = "Американская липа, Wolfgang®",
            fingerBoard = "Клен, Wolfgang® Backshape,пропитанный маслом",
            scale = "25.5(648 мм)",
            pickup = "Direct Mount EVH® Wolfgang® Humbucking (HH)",
            control = "3-х позиционный: Position 1. Bridge Pickup, Position 2. Bridge and Neck Pickups, Position 3. Neck Pickup",
            bridge = "EVH®-Branded Floyd Rose® Special Locking Tremolo ",
            porozhek = "Floyd Rose® R2 Locking 1.625\" (41.3 мм)",
            сolor = "Transparent Black",
            frets = "22 Jumbo"
        ),
        Guitar(
            nameModel = "Player Lead II, Maple Fingerboard, Neon Green",
            body = "Ольха, с глянцевым полиэстером",
            fingerBoard = "Клен, профиль Modern С",
            scale = "25.5(648 мм)",
            pickup = "Два сингла Player Series Alnico 5 Strat® Single-Coil (SS)",
            control = "3-х позиционный, master Volume, master Tone",
            bridge = "6-Saddle String-Through-Body Hardtail With Block Saddles",
            porozhek = "Искуственная кость, 1.650(42 мм)",
            сolor = "Neon Green",
            frets = "22, Medium Jumbo"
        ),
        Guitar(
            nameModel = "Fender Affinity Series™ Telecaster® SS ",
            body = "Telecaster®, ольха",
            fingerBoard = "Клен, профиль",
            scale = "25.5(648 мм)",
            pickup = "Vintage-Style Single-Coil Tele® (SS) нек и бридж",
            control = "3-х позиционный, master Volume, master Tone",
            bridge = "6-Saddle Top-Load Tele",
            porozhek = "Информация отсутствует",
            сolor = "Slick Silver",
            frets = "21"
        ),
        Guitar(
            nameModel = "Сort Classic Rock CR250 ATA",
            body = "Волнистый клен, красное дерево",
            fingerBoard = "Красное дерево",
            scale = "628 мм (24.75)",
            pickup = "Хамбакеры Voiced Tone VTH-59 с использованием магнитов Alnico II",
            control = "3-х позиционный, master Volume, master Tone",
            bridge = "Tune-o-Matic со стоп-баром",
            porozhek = "Graph-Tech Nubone",
            сolor = "Янтарь (Antique Amber)",
            frets = "22 лада"
        )

    )
    guitars.forEachIndexed() { index, guitar ->
        println("${index + 1}.${guitar.nameModel}")
    }
    println("Укажите номер гитары, о которой вы хотите узнать")
    val  numberFromUser = (readLine())
    when(numberFromUser) {
        null -> println("Повторите запрос")
        else ->{
            val guitar = guitars[numberFromUser.toInt() - 1]
            println(guitar)
        }
    }
}




