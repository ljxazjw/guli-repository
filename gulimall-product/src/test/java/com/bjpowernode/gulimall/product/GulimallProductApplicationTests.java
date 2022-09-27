package com.bjpowernode.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bjpowernode.gulimall.product.entity.BrandEntity;
import com.bjpowernode.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
 public class GulimallProductApplicationTests {

   @Autowired
   BrandService brandService;

//    @Autowired
//    OSSClient ossClient;

   @Test
   public void testUpload() throws Exception {
//            // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//            String endpoint = "oss-cn-beijing.aliyuncs.com";
//            // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//            String accessKeyId = "LTAI5tQuFRk83dsCmVxCwESL";
//            String accessKeySecret = "X6HGL19FYxmNUHNe9Z02DM4BUVS5Eo";
//            // 填写Bucket名称，例如examplebucket。
//            String bucketName = "gulimall-ljx11";
//            // 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//            String objectName = "kid.jpg";
//            // 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//            // 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//            String filePath= "C:\\Users\\Administrator\\Desktop\\Kid.jpg";
//
//            // 创建OSSClient实例。
//            OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);


//    @Test
//    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//       测试查询操
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//
//        brandEntity.setBrandId(1l);
//        brandEntity.setDescript("华为");
//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
//        list.forEach((item)->{
//            System.out.println(item);
//        });
//
////        brandService.updateById(brandEntity);
//    }
   }
}
