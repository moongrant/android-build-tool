package p183o00o000o;

import android.content.Context;
import androidx.camera.core.impl.OooOOOO;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import oo00oO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039OoooOoo.o00O0OO0;
import p182o00o000O.OooOO0O;
import p184o00o00O0.OooO0o;
import p673o0oooo0o.oO000OOo;
import p673o0oooo0o.oO0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO<T> implements o0OoOo0<T> {
    @Override // p183o00o000o.o0OoOo0
    @Nullable
    public final Unit OooO00o(@NotNull OooO00o oooO00o) {
        Context context = OooOO0O.f38411OooO0o0;
        File file = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        String strOooO00o = OooOOOO.OooO00o(context.getCacheDir().getAbsolutePath(), "/compress");
        File file2 = new File(strOooO00o);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = oooO00o.f60303OooO0O0;
        Intrinsics.checkNotNull(file3);
        if (!StringsKt__StringsKt.contains$default(OooO0o.OooO0OO(file3), "image/", false, 2, (Object) null)) {
            return Unit.INSTANCE;
        }
        boolean z = false;
        try {
            Context context2 = OooOO0O.f38411OooO0o0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            oO000OOo.OooO00o oooO00o2 = new oO000OOo.OooO00o(context2);
            oooO00o2.f59928OooO0o0.add(new oO0Oo0oo(oooO00o.f60303OooO0O0));
            oooO00o2.f59925OooO0O0 = strOooO00o;
            oooO00o2.f59926OooO0OO = 100;
            oooO00o2.f59927OooO0Oo = new o00O0OO0();
            file = (File) CollectionsKt.getOrNull(oooO00o2.OooO00o(), 0);
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            File file4 = oooO00o.f60303OooO0O0;
            Intrinsics.checkNotNull(file4);
            if (!Intrinsics.areEqual(absolutePath, file4.getAbsolutePath())) {
                z = true;
            }
        }
        oooO00o.f60304OooO0OO = z;
        if (z) {
            File file5 = oooO00o.f60303OooO0O0;
            Intrinsics.checkNotNull(file5);
            file5.delete();
            oooO00o.f60303OooO0O0 = file;
        }
        return Unit.INSTANCE;
    }
}
