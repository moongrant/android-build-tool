package p235o00oOoOo;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231o00oOo0o.o0OO00O;
import p234o00oOoOO.oOO0O0O0;
import p237o00oOoo0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public interface oOOO0O0o<R> extends o0OO00O {
    @Nullable
    oOO0O0O0 getRequest();

    void getSize(@NonNull oOOO00o0 oooo00o0);

    void onLoadCleared(@Nullable Drawable drawable);

    void onLoadFailed(@Nullable Drawable drawable);

    void onLoadStarted(@Nullable Drawable drawable);

    void onResourceReady(@NonNull R r, @Nullable o0O000Oo<? super R> o0o000oo2);

    void removeCallback(@NonNull oOOO00o0 oooo00o0);

    void setRequest(@Nullable oOO0O0O0 ooo0o0o0);
}
