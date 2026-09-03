package androidx.compose.ui;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static boolean OooO00o(Modifier.Element element, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static boolean OooO0O0(Modifier.Element element, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    public static Object OooO0OO(Modifier.Element element, Object obj, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    public static Object OooO0Oo(Modifier.Element element, Object obj, @NotNull Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(element, obj);
    }
}
