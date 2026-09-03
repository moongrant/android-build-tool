package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.components.OooO;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements OooO {
    public static Modifier OooO0O0(float f, Modifier modifier, Composer composer, int i) {
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(modifier, Dp.m3775constructorimpl(f));
        composer.startReplaceableGroup(i);
        return modifierM511height3ABfNKs;
    }

    public static StringBuilder OooO0OO(String str, SimpleTypeMarker simpleTypeMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(simpleTypeMarker);
        sb.append(str2);
        return sb;
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO00o(o00oO0o o00oo0o2) {
        return ExecutorsRegistrar.f19384OooO0OO.get();
    }
}
