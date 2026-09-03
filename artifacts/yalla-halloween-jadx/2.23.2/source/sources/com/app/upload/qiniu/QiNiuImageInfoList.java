package com.app.upload.qiniu;

import com.app.model.ImageInfoModel;
import com.app.upload.Upload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p675oOooo0o.o0000;
import p675oOooo0o.o0000O00;
import p675oOooo0o.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class QiNiuImageInfoList {
    private o0000 progressListCallback;
    private o0000oo<ImageInfoModel> resultListCallback;
    private int tag;
    private ArrayList<String> imageList = null;
    private Map<Integer, ImageInfoModel> qiNiuImageInfoModelMap = null;

    private List<ImageInfoModel> getFinishList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.qiNiuImageInfoModelMap.size(); i++) {
            arrayList.add(this.qiNiuImageInfoModelMap.get(Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onListener(int i, ImageInfoModel imageInfoModel) {
        this.qiNiuImageInfoModelMap.put(Integer.valueOf(i), imageInfoModel);
    }

    public QiNiuImageInfoList addProgressCallback(o0000 o0000Var) {
        return this;
    }

    public QiNiuImageInfoList addResultListCallback(o0000oo<ImageInfoModel> o0000ooVar) {
        return this;
    }

    public void getImageInfoList(ArrayList<String> arrayList, int i) {
        this.imageList = arrayList;
        this.tag = i;
        this.qiNiuImageInfoModelMap = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (final int i2 = 0; i2 < arrayList.size(); i2++) {
            Upload.getImageInfoSingle().addResultCallback(new o0000O00<ImageInfoModel>() { // from class: com.app.upload.qiniu.QiNiuImageInfoList.1
                @Override // p675oOooo0o.o0000O00
                public void result(boolean z, ImageInfoModel imageInfoModel) {
                    QiNiuImageInfoList.this.onListener(i2, imageInfoModel);
                }
            }).getQiNiuImageInfo(arrayList.get(i2));
        }
    }
}
