package p423o0OoO0OO;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDialogExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt$addOnDismissListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1855#2,2:58\n*S KotlinDebug\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt$addOnDismissListener$1\n*L\n12#1:58,2\n*E\n"})
public final class o000Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Lazy<List<Function0<Unit>>> f46678OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000Oo0(Lazy<? extends List<Function0<Unit>>> lazy) {
        super(0);
        this.f46678OooO0Oo = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Iterator<T> it = this.f46678OooO0Oo.getValue().iterator();
        while (it.hasNext()) {
            Function0 function0 = (Function0) it.next();
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
