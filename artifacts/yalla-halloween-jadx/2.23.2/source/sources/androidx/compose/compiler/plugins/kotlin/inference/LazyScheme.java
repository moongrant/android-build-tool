package androidx.compose.compiler.plugins.kotlin.inference;

import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p023Oooo00o.oO00OOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u0003J\b\u0010+\u001a\u00020\u0017H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u001f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0019¨\u0006-"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "", "scheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "context", "", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "bindings", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "(Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;Ljava/util/List;Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;)V", "anyParameters", "", "getAnyParameters", "()Z", "getBindings", "()Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "closed", "getClosed", "parameters", "", "getParameters", "()Ljava/util/List;", "parametersStr", "", "getParametersStr", "()Ljava/lang/String;", ReportItem.QualityKeyResult, "getResult", "()Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "resultStr", "getResultStr", "target", "getTarget", "()Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "targetStr", "getTargetStr", "onChange", "Lkotlin/Function0;", "", "callback", "toCallBindings", "Landroidx/compose/compiler/plugins/kotlin/inference/CallBindings;", "toScheme", "toString", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyScheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/LazyScheme\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1549#2:117\n1620#2,3:118\n1726#2,3:122\n1549#2:125\n1620#2,3:126\n1855#2,2:129\n1549#2:131\n1620#2,3:132\n1#3:121\n*S KotlinDebug\n*F\n+ 1 LazyScheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/LazyScheme\n*L\n32#1:117\n32#1:118,3\n35#1:122,3\n74#1:125\n74#1:126,3\n54#1:129,2\n61#1:131\n61#1:132,3\n*E\n"})
public final class LazyScheme {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean anyParameters;

    @NotNull
    private final Bindings bindings;

    @NotNull
    private final List<LazyScheme> parameters;

    @Nullable
    private final LazyScheme result;

    @NotNull
    private final Binding target;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme$Companion;", "", "()V", "open", "Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LazyScheme open() {
            Open open = new Open(-1, false, 2, null);
            return new LazyScheme(new Scheme(open, null, new Scheme(open, null, null, false, 14, null), false, 10, null), null, null, 6, null);
        }
    }

    public LazyScheme(@NotNull Scheme scheme, @NotNull List<Binding> list, @NotNull Bindings bindings) {
        this.bindings = bindings;
        this.target = scheme.getTarget().toBinding$compiler_hosted(bindings, list);
        this.anyParameters = scheme.getAnyParameters();
        List<Scheme> parameters = scheme.getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(parameters));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyScheme((Scheme) it.next(), list, this.bindings));
        }
        this.parameters = arrayList;
        Scheme result = scheme.getResult();
        this.result = result != null ? new LazyScheme(result, list, this.bindings) : null;
    }

    private final String getParametersStr() {
        return this.parameters.isEmpty() ^ true ? o00O00OO.OooO00o(", ", CollectionsKt___CollectionsKt.joinToString$default(this.parameters, ", ", null, null, 0, null, null, 62, null)) : "";
    }

    private final String getResultStr() {
        LazyScheme lazyScheme = this.result;
        if (lazyScheme != null) {
            String str = CertificateUtil.DELIMITER + lazyScheme;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    private final String getTargetStr() {
        String token = this.target.getToken();
        return token == null ? String.valueOf(this.target.getValue().getIndex()) : token;
    }

    private static final Item toScheme$itemOf(Map<Value, Integer> map, Binding binding) {
        String token = binding.getToken();
        if (token != null) {
            return new Token(token);
        }
        Integer num = map.get(binding.getValue());
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 2;
        boolean z = false;
        return num != null ? new Open(num.intValue(), z, i, defaultConstructorMarker) : new Open(-1, z, i, defaultConstructorMarker);
    }

    private static final void toScheme$mapValues(Map<Value, Integer> map, Ref.IntRef intRef, LazyScheme lazyScheme) {
        Binding binding = lazyScheme.target;
        if (binding.getToken() == null) {
            Value value = binding.getValue();
            Integer num = map.get(value);
            if (num != null && num.intValue() == -1) {
                int i = intRef.element;
                intRef.element = i + 1;
                map.put(value, Integer.valueOf(i));
            } else if (num == null) {
                map.put(value, -1);
            }
        }
        Iterator<T> it = lazyScheme.parameters.iterator();
        while (it.hasNext()) {
            toScheme$mapValues(map, intRef, (LazyScheme) it.next());
        }
        LazyScheme lazyScheme2 = lazyScheme.result;
        if (lazyScheme2 != null) {
            toScheme$mapValues(map, intRef, lazyScheme2);
        }
    }

    private static final Scheme toScheme$schemeOf(Map<Value, Integer> map, LazyScheme lazyScheme) {
        Item scheme$itemOf = toScheme$itemOf(map, lazyScheme.target);
        List<LazyScheme> list = lazyScheme.parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toScheme$schemeOf(map, (LazyScheme) it.next()));
        }
        LazyScheme lazyScheme2 = lazyScheme.result;
        return new Scheme(scheme$itemOf, arrayList, lazyScheme2 != null ? toScheme$schemeOf(map, lazyScheme2) : null, lazyScheme.anyParameters);
    }

    public final boolean getAnyParameters() {
        return this.anyParameters;
    }

    @NotNull
    public final Bindings getBindings() {
        return this.bindings;
    }

    public final boolean getClosed() {
        boolean z;
        if (this.target.getToken() == null) {
            return false;
        }
        LazyScheme lazyScheme = this.result;
        if (lazyScheme != null && !lazyScheme.getClosed()) {
            return false;
        }
        List<LazyScheme> list = this.parameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((LazyScheme) it.next()).getClosed()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @NotNull
    public final List<LazyScheme> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final LazyScheme getResult() {
        return this.result;
    }

    @NotNull
    public final Binding getTarget() {
        return this.target;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.compiler.plugins.kotlin.inference.Scheme] */
    @NotNull
    public final Function0<Unit> onChange(@NotNull final Function0<Unit> callback) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = toScheme();
        return this.bindings.onChange(new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.LazyScheme.onChange.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.compiler.plugins.kotlin.inference.Scheme, java.lang.Object] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ?? scheme = LazyScheme.this.toScheme();
                if (Intrinsics.areEqual((Object) scheme, objectRef.element)) {
                    return;
                }
                callback.invoke();
                objectRef.element = scheme;
            }
        });
    }

    @NotNull
    public final CallBindings toCallBindings() {
        Binding binding = this.target;
        List<LazyScheme> list = this.parameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LazyScheme) it.next()).toCallBindings());
        }
        LazyScheme lazyScheme = this.result;
        return new CallBindings(binding, arrayList, lazyScheme != null ? lazyScheme.toCallBindings() : null, this.anyParameters);
    }

    @NotNull
    public final Scheme toScheme() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        toScheme$mapValues(linkedHashMap, new Ref.IntRef(), this);
        return toScheme$schemeOf(linkedHashMap, this);
    }

    @NotNull
    public String toString() {
        return oO00OOOo.OooO00o("[", getTargetStr(), getParametersStr(), getResultStr(), "]");
    }

    public /* synthetic */ LazyScheme(Scheme scheme, List list, Bindings bindings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheme, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new Bindings() : bindings);
    }
}
