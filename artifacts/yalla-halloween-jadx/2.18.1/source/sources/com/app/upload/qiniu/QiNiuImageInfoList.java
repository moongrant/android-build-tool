package com.app.upload.qiniu;

import com.app.model.ImageInfoModel;
import com.app.upload.Upload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p179o00o0.o00O0O;
import p179o00o0.o00Oo0;
import p179o00o0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class QiNiuImageInfoList {
    private o00Oo0<ImageInfoModel> resultListCallback;
    private int tag;
    private ArrayList<String> imageList = null;
    private Map<Integer, ImageInfoModel> qiNiuImageInfoModelMap = null;
    private o0OoOo0 progressListCallback = null;

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
        o0OoOo0 o0oooo1 = this.progressListCallback;
        if (o0oooo1 != null) {
            this.imageList.size();
            this.qiNiuImageInfoModelMap.size();
            o0oooo1.OooO00o();
        }
        if (this.resultListCallback == null || this.qiNiuImageInfoModelMap.size() != this.imageList.size()) {
            return;
        }
        o00Oo0<ImageInfoModel> o00oo1 = this.resultListCallback;
        getFinishList();
        o00oo1.OooO0O0();
    }

    public QiNiuImageInfoList addProgressCallback(o0OoOo0 o0oooo1) {
        this.progressListCallback = o0oooo1;
        return this;
    }

    public QiNiuImageInfoList addResultListCallback(o00Oo0<ImageInfoModel> o00oo1) {
        this.resultListCallback = o00oo1;
        return this;
    }

    public void getImageInfoList(ArrayList<String> arrayList, int i) {
        this.imageList = arrayList;
        this.tag = i;
        this.qiNiuImageInfoModelMap = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            for (final int i2 = 0; i2 < arrayList.size(); i2++) {
                Upload.getImageInfoSingle().addResultCallback(new o00O0O<ImageInfoModel>() { // from class: com.app.upload.qiniu.QiNiuImageInfoList.1
                    @Override // p179o00o0.o00O0O
                    public void result(boolean z, ImageInfoModel imageInfoModel) {
                        QiNiuImageInfoList.this.onListener(i2, imageInfoModel);
                    }
                }).getQiNiuImageInfo(arrayList.get(i2));
            }
            return;
        }
        o00Oo0<ImageInfoModel> o00oo1 = this.resultListCallback;
        if (o00oo1 != null) {
            getFinishList();
            o00oo1.OooO0O0();
        }
    }
}
