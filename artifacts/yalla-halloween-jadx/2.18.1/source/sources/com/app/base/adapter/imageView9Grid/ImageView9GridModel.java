package com.app.base.adapter.imageView9Grid;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.app.base.application.App;
import com.app.base.bean.AbsJavaBean;
import o00OOO0O.OooO00o;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class ImageView9GridModel extends AbsJavaBean {
    private int gifType = -1;
    private int height;
    private String url;
    private int width;

    public ImageView9GridModel(String str) {
        this.url = str;
    }

    public int getGifType() {
        return this.gifType;
    }

    public int getHeight() {
        return this.height;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public ImageView9GridModel initLocalSize() {
        if (!TextUtils.isEmpty(this.url)) {
            BitmapFactory.Options optionsOooO0O0 = OooO00o.OooO0O0(App.f11458Oooo0oO, this.url);
            this.width = optionsOooO0O0.outWidth;
            this.height = optionsOooO0O0.outHeight;
        }
        return this;
    }

    public void setGifType(int i) {
        this.gifType = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:10:0x001a, B:15:0x002c), top: B:20:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x003c A[SYNTHETIC] */
    public ImageView9GridModel setSize(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("*")) {
            String[] strArrSplit = str.split("\\*");
            for (int i = 0; i < strArrSplit.length; i++) {
                if (i == 0) {
                    try {
                        this.width = Integer.valueOf(strArrSplit[i]).intValue();
                        if (i == 1) {
                            this.height = Integer.valueOf(strArrSplit[i]).intValue();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i == 1) {
                    this.height = Integer.valueOf(strArrSplit[i]).intValue();
                }
            }
        }
        return this;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImageView9GridModel{url='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", height=");
        sbOooO0o0.append(this.height);
        sbOooO0o0.append(", gifType=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.gifType, '}');
    }

    public ImageView9GridModel initLocalSize(int i, int i2) {
        this.width = i;
        this.height = i2;
        return this;
    }
}
