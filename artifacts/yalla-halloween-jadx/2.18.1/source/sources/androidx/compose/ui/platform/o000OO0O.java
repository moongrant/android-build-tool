package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import kotlin.Function;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o;
import p100o000oOoO.o0OO000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Class<? extends Object>[] f6444OooO00o = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean OooO00o(Object obj) {
        if (obj instanceof p047Oooooo0.o00OO0O0) {
            p047Oooooo0.o00OO0O0 o00oo0o1 = (p047Oooooo0.o00OO0O0) obj;
            if (o00oo0o1.OooO() != p100o000oOoO.o0O00OOO.f29537OooO00o && o00oo0o1.OooO() != o.f29323OooO00o && o00oo0o1.OooO() != o0OO000.f29595OooO00o) {
                return false;
            }
            T value = o00oo0o1.getValue();
            if (value == 0) {
                return true;
            }
            return OooO00o(value);
        }
        if ((obj instanceof Function) && (obj instanceof Serializable)) {
            return false;
        }
        Class<? extends Object>[] clsArr = f6444OooO00o;
        for (int i = 0; i < 7; i++) {
            if (clsArr[i].isInstance(obj)) {
                return true;
            }
        }
        return false;
    }
}
