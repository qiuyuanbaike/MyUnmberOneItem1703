package com.myunmbertwoitem1703;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class OneTurnActivity extends AppCompatActivity implements View.OnClickListener {


    private Spinner spinner_item_h, spinner_item_m;
    private ArrayAdapter<String> adapter_m, adapter_h;
    private Button sure_Button;
    private EditText content_edit;

    private CheckBox
            pic_Box01,pic_Box02,pic_Box03,pic_Box04
            ,pic_Box05,pic_Box06,pic_Box07,pic_Box08
            ,pic_Box09;

    private ImageView
            imageView_pic_01, imageView_pic_02,
            imageView_pic_03, imageView_pic_04,
            imageView_pic_05, imageView_pic_06,
            imageView_pic_07, imageView_pic_08,
            imageView_pic_09;


    public String spinner_m[] = {
            "00", "5", "10", "15", "20", "25"
            , "30", "35", "40", "45", "50",
            "55"};
    private String spinner_h[] = {
            "00", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_turn);
        initialUI();
        setImageViewOnClick();
        setSpinnerList();


    }

    //往spinner添加数组
    private void setSpinnerList() {
        adapter_m = new ArrayAdapter<String>(this, R.layout.text, spinner_m);
        adapter_h = new ArrayAdapter<String>(this, R.layout.text, spinner_h);
        spinner_item_m.setAdapter(adapter_m);
        spinner_item_h.setAdapter(adapter_h);
    }


    //初始化控件
    private void initialUI() {
        spinner_item_h = (Spinner) findViewById(R.id.item_sponner_H);
        spinner_item_m = (Spinner) findViewById(R.id.item_sponner_M);

        sure_Button = (Button) findViewById(R.id.sure_buttonId);
        content_edit = (EditText) findViewById(R.id.content_editId);

        imageView_pic_01 = (ImageView) findViewById(R.id.pic_image_01);
        imageView_pic_02 = (ImageView) findViewById(R.id.pic_image_02);
        imageView_pic_03 = (ImageView) findViewById(R.id.pic_image_03);
        imageView_pic_04 = (ImageView) findViewById(R.id.pic_image_04);
        imageView_pic_05 = (ImageView) findViewById(R.id.pic_image_05);
        imageView_pic_06 = (ImageView) findViewById(R.id.pic_image_06);
        imageView_pic_07 = (ImageView) findViewById(R.id.pic_image_07);
        imageView_pic_08 = (ImageView) findViewById(R.id.pic_image_08);
        imageView_pic_09 = (ImageView) findViewById(R.id.pic_image_09);

        pic_Box01= (CheckBox) findViewById(R.id.checkBox01);
        pic_Box02= (CheckBox) findViewById(R.id.checkBox02);
        pic_Box03= (CheckBox) findViewById(R.id.checkBox03);
        pic_Box04= (CheckBox) findViewById(R.id.checkBox04);
        pic_Box05= (CheckBox) findViewById(R.id.checkBox05);
        pic_Box06= (CheckBox) findViewById(R.id.checkBox06);
        pic_Box07= (CheckBox) findViewById(R.id.checkBox07);
        pic_Box08= (CheckBox) findViewById(R.id.checkBox08);
        pic_Box09= (CheckBox) findViewById(R.id.checkBox09);

    }

    private void isImageIfNull() {
        if (imageView_pic_01.getDrawable() != null) {
            imageView_pic_02.setVisibility(View.VISIBLE);
        }
        if (imageView_pic_02.getDrawable() != null) {
            imageView_pic_03.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_03.getDrawable() != null) {
            imageView_pic_04.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_04.getDrawable() != null) {
            imageView_pic_05.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_05.getDrawable() != null) {
            imageView_pic_06.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_06.getDrawable() != null) {
            imageView_pic_07.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_07.getDrawable() != null) {
            imageView_pic_08.setVisibility(View.VISIBLE);

        }
        if (imageView_pic_08.getDrawable() != null) {
            imageView_pic_09.setVisibility(View.VISIBLE);
        }
    }

    /**
     * imageView点击监听事件
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pic_image_01:
                clickAddPic1();
                break;
            case R.id.pic_image_02:
                clickAddPic2();
                break;
            case R.id.pic_image_03:
                clickAddPic3();
                break;
            case R.id.pic_image_04:
                clickAddPic4();
                break;
            case R.id.pic_image_05:
                clickAddPic5();
                break;
            case R.id.pic_image_06:
                clickAddPic6();
                break;
            case R.id.pic_image_07:
                clickAddPic7();
                break;
            case R.id.pic_image_08:
                clickAddPic8();
                break;
            case R.id.pic_image_09:
                clickAddPic9();
                break;
            case R.id.sure_buttonId:
                isContent();

        }
    }

    /**
     * 为控件绑定监听事件
     */
    private void setImageViewOnClick() {
        sure_Button.setOnClickListener(this);
        imageView_pic_01.setOnClickListener(this);
        imageView_pic_02.setOnClickListener(this);
        imageView_pic_03.setOnClickListener(this);
        imageView_pic_04.setOnClickListener(this);
        imageView_pic_05.setOnClickListener(this);
        imageView_pic_06.setOnClickListener(this);
        imageView_pic_07.setOnClickListener(this);
        imageView_pic_08.setOnClickListener(this);
        imageView_pic_09.setOnClickListener(this);

        imageView_pic_01.setOnLongClickListener(new deleteImagePic());
        imageView_pic_02.setOnLongClickListener(new deleteImagePic());
        imageView_pic_03.setOnLongClickListener(new deleteImagePic());
        imageView_pic_04.setOnLongClickListener(new deleteImagePic());
        imageView_pic_05.setOnLongClickListener(new deleteImagePic());
        imageView_pic_06.setOnLongClickListener(new deleteImagePic());
        imageView_pic_07.setOnLongClickListener(new deleteImagePic());
        imageView_pic_08.setOnLongClickListener(new deleteImagePic());
        imageView_pic_09.setOnLongClickListener(new deleteImagePic());

        pic_Box01.setOnClickListener(this);
        pic_Box02.setOnClickListener(this);
        pic_Box03.setOnClickListener(this);
        pic_Box04.setOnClickListener(this);
        pic_Box05.setOnClickListener(this);
        pic_Box06.setOnClickListener(this);
        pic_Box07.setOnClickListener(this);
        pic_Box08.setOnClickListener(this);
        pic_Box09.setOnClickListener(this);

    }


    /**
     * 点击ImageView添加本地数据图片步骤一
     */
    private void clickAddPic1() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 1);
    }

    private void clickAddPic2() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 2);
    }

    private void clickAddPic3() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 3);
    }

    private void clickAddPic4() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 4);
    }

    private void clickAddPic5() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 5);
    }

    private void clickAddPic6() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 6);
    }

    private void clickAddPic7() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 7);
    }

    private void clickAddPic8() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 8);
    }

    private void clickAddPic9() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 9);
    }

    /**
     * 点击ImageView添加本地数据图片步骤二
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_01.setImageURI(data.getData());
                isImageIfNull();
            }

        } else if (requestCode == 2 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_02.setImageURI(data.getData());
                isImageIfNull();
            }

        } else if (requestCode == 3 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_03.setImageURI(data.getData());
                isImageIfNull();
            }

        } else if (requestCode == 4 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_04.setImageURI(data.getData());
                isImageIfNull();
            }

        } else if (requestCode == 5 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_05.setImageURI(data.getData());
                isImageIfNull();
            }
        } else if (requestCode == 6 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_06.setImageURI(data.getData());
                isImageIfNull();
            }
        } else if (requestCode == 7 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_07.setImageURI(data.getData());
                isImageIfNull();
            }
        } else if (requestCode == 8 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_08.setImageURI(data.getData());
                isImageIfNull();
            }
        } else if (requestCode == 9 && resultCode == RESULT_OK) {
            if (data != null) {
                imageView_pic_09.setImageURI(data.getData());
                Toast.makeText(this, "可添加的图片已达到上限", Toast.LENGTH_SHORT).show();
                isImageIfNull();
            }

        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * 清空ImageView控件上的图片
     */
    private void DrawableImaeg() {
        imageView_pic_01.setImageDrawable(null);

        //清空后设置控件隐藏
        imageView_pic_02.setVisibility(View.INVISIBLE);
        imageView_pic_03.setVisibility(View.INVISIBLE);
        imageView_pic_04.setVisibility(View.INVISIBLE);
        imageView_pic_05.setVisibility(View.INVISIBLE);
        imageView_pic_06.setVisibility(View.INVISIBLE);
        imageView_pic_07.setVisibility(View.INVISIBLE);
        imageView_pic_08.setVisibility(View.INVISIBLE);
        imageView_pic_09.setVisibility(View.INVISIBLE);
    }

    private void isImageId(View view) {

    }


    /**
     * 提交内容时进行读取控件内容读取判断
     */
    private void isContent() {
        String content = content_edit.getText().toString();
        if (!TextUtils.isEmpty(content) && imageView_pic_01.getDrawable() == null) {
            MyImageViewDialog();
            //清空文本
        } else if (!TextUtils.isEmpty(content) && imageView_pic_01.getDrawable() != null) {
            setTransmit();
            content_edit.setText("");
            DrawableImaeg();
            Toast.makeText(OneTurnActivity.this, "提交成功！", Toast.LENGTH_SHORT).show();

        } else if (TextUtils.isEmpty(content)) {
            Toast.makeText(this, "内容文本不能为空", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * ImageView为空时弹出Dialog对话框提示操作
     */
    private void MyImageViewDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.lan)
                .setTitle("温馨提示！")
                .setMessage("您当前没有添加任何图片")
                .setNegativeButton("返回", null)
                .setPositiveButton("不添加", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setTransmit();
                        content_edit.setText("");
                        Toast.makeText(OneTurnActivity.this, "提交成功！", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();

                    }
                });
        builder.create().show();
    }

    /**
     * 长按弹出Dialog操作删除图片，待实现--------？
     */

    private void DrawableImaegDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.images)
                .setTitle("危险操作！")
                .setMessage("你正在操作删除图片，是否继续！")
                .setNegativeButton("取消", null)
                .setPositiveButton("删除", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();

                    }
                });
        builder.create().show();
    }

    /**
     * 获取EditText的内容用Intent提交给另外一个Activity
     */
    private void setTransmit() {
        Intent intent = new Intent(this, StoreContent.class);
        //传递文本内容
        intent.putExtra("str", content_edit.getText().toString());
        //传递图片
        imageView_pic_01.setDrawingCacheEnabled(true);
        imageView_pic_02.setDrawingCacheEnabled(true);
        imageView_pic_03.setDrawingCacheEnabled(true);
        imageView_pic_04.setDrawingCacheEnabled(true);
        imageView_pic_05.setDrawingCacheEnabled(true);
        imageView_pic_06.setDrawingCacheEnabled(true);
        imageView_pic_07.setDrawingCacheEnabled(true);
        imageView_pic_08.setDrawingCacheEnabled(true);
        imageView_pic_09.setDrawingCacheEnabled(true);

        Bitmap bitmap02 = Bitmap.createBitmap(imageView_pic_02.getDrawingCache());
        Bitmap bitmap01 = Bitmap.createBitmap(imageView_pic_01.getDrawingCache());
        Bitmap bitmap03 = Bitmap.createBitmap(imageView_pic_03.getDrawingCache());
        Bitmap bitmap04 = Bitmap.createBitmap(imageView_pic_04.getDrawingCache());
        Bitmap bitmap05 = Bitmap.createBitmap(imageView_pic_05.getDrawingCache());
        Bitmap bitmap06 = Bitmap.createBitmap(imageView_pic_06.getDrawingCache());
        Bitmap bitmap07 = Bitmap.createBitmap(imageView_pic_07.getDrawingCache());
        Bitmap bitmap08 = Bitmap.createBitmap(imageView_pic_08.getDrawingCache());
        Bitmap bitmap09 = Bitmap.createBitmap(imageView_pic_09.getDrawingCache());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos3 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos4 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos5 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos6 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos7 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos8 = new ByteArrayOutputStream();
        ByteArrayOutputStream bos9 = new ByteArrayOutputStream();

        bitmap01.compress(Bitmap.CompressFormat.PNG, 100, bos);
        bitmap02.compress(Bitmap.CompressFormat.PNG, 100, bos2);
        bitmap03.compress(Bitmap.CompressFormat.PNG, 100, bos3);
        bitmap04.compress(Bitmap.CompressFormat.PNG, 100, bos4);
        bitmap05.compress(Bitmap.CompressFormat.PNG, 100, bos5);
        bitmap06.compress(Bitmap.CompressFormat.PNG, 100, bos6);
        bitmap07.compress(Bitmap.CompressFormat.PNG, 100, bos7);
        bitmap08.compress(Bitmap.CompressFormat.PNG, 100, bos8);
        bitmap09.compress(Bitmap.CompressFormat.PNG, 100, bos9);

        byte[] b = bos.toByteArray();
        byte[] b2 = bos2.toByteArray();
        byte[] b3 = bos3.toByteArray();
        byte[] b4 = bos4.toByteArray();
        byte[] b5 = bos5.toByteArray();
        byte[] b6 = bos6.toByteArray();
        byte[] b7 = bos7.toByteArray();
        byte[] b8 = bos8.toByteArray();
        byte[] b9 = bos9.toByteArray();

        intent.putExtra("pic", b);
        intent.putExtra("pic2", b2);
        intent.putExtra("pic3", b3);
        intent.putExtra("pic4", b4);
        intent.putExtra("pic5", b5);
        intent.putExtra("pic6", b6);
        intent.putExtra("pic7", b7);
        intent.putExtra("pic8", b8);
        intent.putExtra("pic9", b9);

        imageView_pic_01.setDrawingCacheEnabled(false);
        imageView_pic_02.setDrawingCacheEnabled(false);
        imageView_pic_03.setDrawingCacheEnabled(false);
        imageView_pic_04.setDrawingCacheEnabled(false);
        imageView_pic_05.setDrawingCacheEnabled(false);
        imageView_pic_06.setDrawingCacheEnabled(false);
        imageView_pic_07.setDrawingCacheEnabled(false);
        imageView_pic_08.setDrawingCacheEnabled(false);
        imageView_pic_09.setDrawingCacheEnabled(false);
        startActivity(intent);
    }
    //显示CheckBox
    private void InvisibleBox(){
        pic_Box01.setVisibility(View.VISIBLE);
        pic_Box02.setVisibility(View.VISIBLE);
        pic_Box03.setVisibility(View.VISIBLE);
        pic_Box04.setVisibility(View.VISIBLE);
        pic_Box05.setVisibility(View.VISIBLE);
        pic_Box06.setVisibility(View.VISIBLE);
        pic_Box07.setVisibility(View.VISIBLE);
        pic_Box08.setVisibility(View.VISIBLE);
        pic_Box09.setVisibility(View.VISIBLE);
    }

    /**
     * 长按删除ImageView控件内容
     */
    public class deleteImagePic implements View.OnLongClickListener {

        @Override
        public boolean onLongClick(View v) {
            switch (v.getId()) {
                case R.id.pic_image_01:
                    InvisibleBox();
                    break;
                case R.id.pic_image_02:
                    DrawableImaegDialog();

                    break;
                case R.id.pic_image_03:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_04:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_05:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_06:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_07:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_08:
                    DrawableImaegDialog();
                    break;
                case R.id.pic_image_09:
                    DrawableImaegDialog();
                    break;
            }
            return true;
        }
    }

}
