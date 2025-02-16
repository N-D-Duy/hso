package template;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class Itemsellcoin {

    public static List<Itemsellcoin> entry = new ArrayList<>();
    public short id;
    public List<Option> op;
    public int price;
    public byte color;

    static {
        String medal
                = "   [[4587,[[2,1000],[96,10]],4,100000],"
                + "[4590,[[3,1000],[96,10]],4,100000],"
                + "[4589,[[4,1000],[96,10]],4,100000],"
                + "[4588,[[1,1000],[96,10]],4,100000]]";
        String tt = "[[4756,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[37,1],[27,2000],[28,2000]],4,200000],"
                + "[4757,[[15,2000],[27,2000]],4,50000],"
                + "[4716,[[23,10],[24,10],[25,10],[26,10],[27,1000],[30,1000]],5,75000]"
                + "[4717,[[23,39],[24,39],[25,39],[26,39],[27,1000],[29,1000]],5,100000]"
                + "[4718,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[-76, 1000]],5,100000]"
                + "[4719,[[7,500],[8,500],[9,500],[10,500],[11,500]],5,750000]"
                + "[4746,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[37,1],[27,3000]],4,200000]"
                + "[4747,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,120000]"
                + "[4748,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,750000]"
                + "[4765,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4766,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4767,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4720,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4721,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4722,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4723,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4724,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4725,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4726,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4775,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4776,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4777,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4778,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4779,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4780,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4781,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4782,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4783,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4784,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                + "[4785,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                + "[4786,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                + "[4787,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                + "[4773,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4774,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4789,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4790,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4793,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4794,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4795,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4712,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4713,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4707,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4617,[],5,100000]"
                + "[4626,[],5,150000]"
                + "[4631,[],5,100000]"
                + "[4699,[],5,100000]"
                + "[4761,[],5,100000]"
                + "[4762,[],5,100000]"
                + "[4768,[],5,100000]"
                + "[2940,[[23,24],[24,24],[25,24],[26,24],[37,2]],5,150000]"
                + "[4791,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4792,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4691,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4692,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4693,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4694,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4755,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4730,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4731,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[3604,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3607,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3608,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3611,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3612,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3613,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3614,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3615,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4585,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4586,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4591,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4592,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4593,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4616,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4618,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4627,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4628,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4629,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4630,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4637,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4655,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4654,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4696,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4697,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4698,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4711,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4740,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4741,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4742,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4743,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4744,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4745,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4749,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4750,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4751,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4752,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4763,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4764,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4758,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4759,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3265,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[3267,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "[4760,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]]";

        JSONArray js = (JSONArray) JSONValue.parse(medal);
        for (int i = 0; i < js.size(); i++) {
            Itemsellcoin temp = new Itemsellcoin();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            Itemsellcoin.entry.add(temp);
        }
        //
        js.clear();
        js = (JSONArray) JSONValue.parse(tt);
        for (int i = 0; i < js.size(); i++) {
            Itemsellcoin temp = new Itemsellcoin();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            Itemsellcoin.entry.add(temp);
        }
    }
}
