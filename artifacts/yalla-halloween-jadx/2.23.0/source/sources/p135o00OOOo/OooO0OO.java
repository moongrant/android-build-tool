package p135o00OOOo;

import android.content.Context;
import androidx.camera.core.impl.OooOOOO;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p136o00OOOo0.OooOO0;
import p139o00OOooO.OooO;
import p668o0oooo00.o00O0O0O;
import p668o0oooo00.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO<T> implements OooO0o<T> {
    @Override // p135o00OOOo.OooO0o
    @Nullable
    public final Unit OooO00o(@NotNull p137o00OOOoO.OooO0OO oooO0OO) {
        Context context = OooOO0.f37361OooO0o0;
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
        File file3 = oooO0OO.f37426OooO0O0;
        Intrinsics.checkNotNull(file3);
        if (!StringsKt.OooO0o(OooO.OooO0OO(file3), "image/")) {
            return Unit.INSTANCE;
        }
        boolean z = false;
        try {
            Context context2 = OooOO0.f37361OooO0o0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            o00O0OO0.OooO00o oooO00o = new o00O0OO0.OooO00o(context2);
            oooO00o.f60352OooO0o0.add(new o00O0O0O(oooO0OO.f37426OooO0O0));
            oooO00o.f60349OooO0O0 = strOooO00o;
            oooO00o.f60350OooO0OO = 100;
            oooO00o.f60351OooO0Oo = new OooO0O0();
            file = (File) CollectionsKt.getOrNull(oooO00o.OooO00o(), 0);
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            File file4 = oooO0OO.f37426OooO0O0;
            Intrinsics.checkNotNull(file4);
            if (!Intrinsics.areEqual(absolutePath, file4.getAbsolutePath())) {
                z = true;
            }
        }
        oooO0OO.f37427OooO0OO = z;
        if (z) {
            File file5 = oooO0OO.f37426OooO0O0;
            Intrinsics.checkNotNull(file5);
            file5.delete();
            oooO0OO.f37426OooO0O0 = file;
        }
        return Unit.INSTANCE;
    }
}
