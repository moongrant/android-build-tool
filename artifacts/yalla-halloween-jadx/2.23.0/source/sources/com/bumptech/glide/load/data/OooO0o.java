package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0o<T> {

    public interface OooO00o<T> {
        void OooO0OO(@NonNull Exception exc);

        void OooO0o0(@Nullable T t);
    }

    @NonNull
    Class<T> OooO00o();

    void OooO0O0();

    void OooO0Oo(@NonNull Priority priority, @NonNull OooO00o<? super T> oooO00o);

    void cancel();

    @NonNull
    DataSource getDataSource();
}
