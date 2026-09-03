package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface OooO<T> {

    public interface OooO00o<T> {
        @NonNull
        Class<T> OooO00o();

        @NonNull
        OooO<T> OooO0O0(@NonNull T t);
    }

    @NonNull
    T OooO00o() throws IOException;

    void OooO0O0();
}
