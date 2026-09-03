package androidx.compose.compiler.plugins.kotlin.inference;

import com.qiniu.android.collect.ReportItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;", "", "target", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "parameters", "", ReportItem.QualityKeyResult, "anyParameters", "", "(Landroidx/compose/compiler/plugins/kotlin/inference/Binding;Ljava/util/List;Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;Z)V", "getAnyParameters", "()Z", "getParameters", "()Ljava/util/List;", "getResult", "()Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;", "getTarget", "()Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCallBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallBindings.kt\nandroidx/compose/compiler/plugins/kotlin/inference/CallBindings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class CallBindings {
    private final boolean anyParameters;

    @NotNull
    private final List<CallBindings> parameters;

    @Nullable
    private final CallBindings result;

    @NotNull
    private final Binding target;

    public CallBindings(@NotNull Binding target, @NotNull List<CallBindings> parameters, @Nullable CallBindings callBindings, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.target = target;
        this.parameters = parameters;
        this.result = callBindings;
        this.anyParameters = z;
    }

    public final boolean getAnyParameters() {
        return this.anyParameters;
    }

    @NotNull
    public final List<CallBindings> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final CallBindings getResult() {
        return this.result;
    }

    @NotNull
    public final Binding getTarget() {
        return this.target;
    }

    @NotNull
    public String toString() {
        String str = "";
        String strOooO00o = this.parameters.isEmpty() ? "" : o00O00OO.OooO00o(", ", CollectionsKt___CollectionsKt.joinToString$default(this.parameters, ", ", null, null, 0, null, new Function1<CallBindings, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.CallBindings$toString$paramsString$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull CallBindings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null));
        String str2 = this.anyParameters ? "*" : "";
        CallBindings callBindings = this.result;
        if (callBindings != null) {
            String str3 = "-> " + callBindings;
            if (str3 != null) {
                str = str3;
            }
        }
        return "[" + this.target + str2 + strOooO00o + str + "]";
    }

    public /* synthetic */ CallBindings(Binding binding, List list, CallBindings callBindings, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(binding, (i & 2) != 0 ? CollectionsKt.emptyList() : list, callBindings, z);
    }
}
