package com.app.impl;

import com.app.model.UploadModel;

/* JADX INFO: loaded from: classes2.dex */
public interface UploadSingleCallback {

    public enum State {
        complete,
        err,
        cancel
    }

    void result(State state, UploadModel uploadModel);
}
