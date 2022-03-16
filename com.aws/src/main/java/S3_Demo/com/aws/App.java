package S3_Demo.com.aws;

import java.io.File;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
public class App {
    public static void main(String[] args) {
        String bucketName = "priyanka-s3-bucket";
        String fileName = "beach2.jpg";
        String filePath = "C:/Users/priya/OneDrive/Desktop/images/" + fileName;
        S3Client client = S3Client.builder().build();
        PutObjectRequest request = PutObjectRequest.builder()
                            .bucket(bucketName).key(fileName).build();
        client.putObject(request, RequestBody.fromFile(new File(filePath)));
    }
}
