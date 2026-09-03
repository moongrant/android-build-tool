package com.app.model;

import OooO00o.OooO00o;
import android.app.Activity;
import android.view.WindowManager;
import com.app.upload.qiniu.QiNiuImageUrlHelper;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ImageInfoModel implements Serializable {
    private String colorModel;
    private String format;
    private int frameNumber;
    private int height;
    private String orientation;
    private int size;
    private String url;
    private int width;

    public String getColorModel() {
        return this.colorModel;
    }

    public String getFormat() {
        return this.format;
    }

    public int getFrameNumber() {
        return this.frameNumber;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public int getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlThumbnail(Activity activity) {
        if (activity == null || (getWidth() == 0 && getHeight() == 0)) {
            return this.url;
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        double width2 = (((double) width) / ((double) getWidth())) * 100.0d;
        double height2 = (((double) height) / ((double) getHeight())) * 100.0d;
        if (height2 > width2) {
            width2 = height2;
        }
        return QiNiuImageUrlHelper.getUrl(this.url, width2);
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isGif() {
        return "gif".equals(this.format) && this.frameNumber > 1;
    }

    public ImageInfoModel setUrl(String str) {
        this.url = str;
        return this;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ImageInfoModel{size=");
        sbOooO0o0.append(this.size);
        sbOooO0o0.append(", format='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.format, '\'', ", width=");
        sbOooO0o0.append(this.width);
        sbOooO0o0.append(", height=");
        sbOooO0o0.append(this.height);
        sbOooO0o0.append(", colorModel='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.colorModel, '\'', ", frameNumber=");
        sbOooO0o0.append(this.frameNumber);
        sbOooO0o0.append(", orientation='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.orientation, '\'', "\n url='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', '}');
    }
}
