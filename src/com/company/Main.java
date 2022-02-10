package com.company;

/*Для классов Box и ColorBox из предыдущей домашки переопределить метод toString класса Object,
в котором в реализации класса Box возвращать информацию о длине, ширине и высоте, а также материала коробки,
а для класса ColorBox - всю ту же информации плюс информацию о цвете коробки.
Добавить в конструктор класса Box генерацию исключения если хоть одна из сторон была задана неверно (меньше либо равна нулю)
и обрабатывать это исключение в месте создания экземпляра коробки (как Box так и ColorBox)
Также создать класс Склад (Warehouse, например), который будет в себе содержать массив коробок (именно базовый тип коробок - Box)
и количество коробок, которые уже добавлены в этот массив. Массив создавать в конструкторе этого класса
(размер массива принимать как параметр конструктора). Реализовать метод в этом классе для добавления коробки
в массив (тип брать опять же базовый - Box), предусмотреть валидацию - проверять, можно ли ещё добавить в массив коробку,
количество добавленных коробок не должно превышать длину массива. Также переопределить метод toString
для этого класса - который будет возвращать информацию о всех коробках, которые хранит в себе склад.
В методе main создать экземпляр класса Склад (задать его вместимость с помощью конструктора).
Заполнить склад коробками (разными - как экземплярами Box, так и ColorBox) и вывести информацию о складе (вызвать метод склада toString).*/
public class Main {

    public static void main(String[] args) {

        Box boxOne = new Box(3, 4, 3);
        Box boxTwo = new Box(7, 5, 2);
        Box boxThree = new Box(2, 6, 8);

        boxOne.setName("FirstBox");
        boxTwo.setName("SecondBox");
        boxThree.setName("ThirdBox");

        Box[] boxes = new Box[3];
        boxes[0] = boxOne;
        boxes[1] = boxTwo;
        boxes[2] = boxThree;

        System.out.println();
        for (Box box : boxes) {
            System.out.println("volume of " + box.getName() + " box: " + box.volume());
        }

        ColorBox colorBoxOne = new ColorBox(1, 2, 3, Color.BROWN);
        ColorBox colorBoxTwo = new ColorBox(3, 2, 3, Material.METAL, Color.BLACK);
        ColorBox colorBoxThree = new ColorBox(2, 2, 8, "ThirdColorBox", Material.PLASTIC, Color.WHITE);

        colorBoxOne.setName("FirstColorBox");
        colorBoxOne.setMaterial(Material.WOOD);
        colorBoxTwo.setName("SecondColorBox");

        ColorBox[] colorBoxes = new ColorBox[3];
        colorBoxes[0] = colorBoxOne;
        colorBoxes[1] = colorBoxTwo;
        colorBoxes[2] = colorBoxThree;

        System.out.println();
        for (ColorBox colorbox : colorBoxes) {
            System.out.println("volume of " + colorbox.getName() + " that is " + colorbox.getColor() + " ,made of "
                    + colorbox.getMaterial() + " is: " + colorbox.volume());
        }

//5.02.22

        Warehouse warehouse = new Warehouse("warehouse", 4);

        warehouse.addBox(boxOne);
        warehouse.addBox(colorBoxOne);
        warehouse.addBox(boxTwo);
        warehouse.addBox(colorBoxTwo);
        warehouse.addBox(boxThree);

        System.out.println(warehouse.toString());

    }
}
