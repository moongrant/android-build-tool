package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO<T> {

    public interface OooO00o<T> {
        @NonNull
        Class<T> OooO00o();

        @NonNull
        OooO<T> build(@NonNull T t);
    }

    @NonNull
    T OooO00o() throws IOException;

    void OooO0O0();
}
