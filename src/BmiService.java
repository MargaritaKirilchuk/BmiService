public class BmiService {
    public float calculate (float weight, int height){
        float index = weight / (height * height) * 10000;

        return index;
    }
}
