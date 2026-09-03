package androidx.compose.ui.modifier;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static java.lang.Object OooO00o(androidx.compose.ui.modifier.ModifierLocalModifierNode r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.modifier.ModifierLocal r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.OooO0O0.OooO00o(androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocal):java.lang.Object");
    }

    @NotNull
    public static ModifierLocalMap OooO0O0(ModifierLocalModifierNode modifierLocalModifierNode) {
        return EmptyMap.INSTANCE;
    }

    public static void OooO0OO(ModifierLocalModifierNode modifierLocalModifierNode, @NotNull ModifierLocal key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!(modifierLocalModifierNode.getProvidedValues() != EmptyMap.INSTANCE)) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        }
        if (modifierLocalModifierNode.getProvidedValues().contains$ui_release(key)) {
            modifierLocalModifierNode.getProvidedValues().mo2877set$ui_release(key, obj);
            return;
        }
        throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + key + " was not found.").toString());
    }
}
