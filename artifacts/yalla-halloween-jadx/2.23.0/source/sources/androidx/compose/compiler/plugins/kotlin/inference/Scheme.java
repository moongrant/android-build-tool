package androidx.compose.compiler.plugins.kotlin.inference;

import com.qiniu.android.collect.ReportItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0000H\u0002J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0000J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u000fJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u000fH\u0016J\u0012\u0010'\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "", "target", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "parameters", "", ReportItem.QualityKeyResult, "anyParameters", "", "(Landroidx/compose/compiler/plugins/kotlin/inference/Item;Ljava/util/List;Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;Z)V", "getAnyParameters", "()Z", "getParameters", "()Ljava/util/List;", "parametersStr", "", "getParametersStr", "()Ljava/lang/String;", "getResult", "()Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "resultStr", "getResultStr", "getTarget", "()Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "alphaRename", "canOverride", "other", "equals", "hashCode", "", "serialize", "serializeTo", "", "writer", "Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter;", "simpleCanOverride", "simpleEquals", "simpleHashCode", "toString", "hashOfElements", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/Scheme\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,419:1\n1#2:420\n1726#3,3:421\n1726#3,3:424\n1549#3:427\n1620#3,3:428\n2752#3,8:431\n1855#3,2:439\n1855#3,2:441\n1549#3:443\n1620#3,3:444\n1747#3,3:447\n*S KotlinDebug\n*F\n+ 1 Scheme.kt\nandroidx/compose/compiler/plugins/kotlin/inference/Scheme\n*L\n124#1:421,3\n132#1:424,3\n139#1:427\n139#1:428,3\n139#1:431,8\n147#1:439,2\n182#1:441,2\n197#1:443\n197#1:444,3\n200#1:447,3\n*E\n"})
public final class Scheme {
    private final boolean anyParameters;

    @NotNull
    private final List<Scheme> parameters;

    @Nullable
    private final Scheme result;

    @NotNull
    private final Item target;

    public Scheme(@NotNull Item target, @NotNull List<Scheme> parameters, @Nullable Scheme scheme, boolean z) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.target = target;
        this.parameters = parameters;
        this.result = scheme;
        this.anyParameters = z;
        if (!(!z || parameters.isEmpty())) {
            throw new IllegalStateException("`anyParameters` == true must have empty parameters".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    private final Scheme alphaRename() {
        Item item = this.target;
        if (item instanceof Open) {
            int index = ((Open) item).getIndex();
            boolean z = false;
            if (-1 <= index && index < 1) {
                z = true;
            }
            if (z) {
                if (this.parameters.isEmpty()) {
                    return this;
                }
            }
        } else if (this.parameters.isEmpty()) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        alphaRename$scan(linkedHashMap, new Ref.IntRef(), this);
        return linkedHashMap.isEmpty() ? this : alphaRename$rename(linkedHashMap, this);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    private static final Scheme alphaRename$rename(Map<Integer, Integer> map, Scheme scheme) {
        Item open;
        Item item = scheme.target;
        List<Scheme> list = scheme.parameters;
        Scheme scheme2 = scheme.result;
        Object[] objArr = 0;
        boolean z = false;
        if (item instanceof Open) {
            Open open2 = (Open) item;
            int index = open2.getIndex();
            Integer num = map.get(Integer.valueOf(open2.getIndex()));
            if (num != null && index == num.intValue()) {
                open = item;
            } else {
                Integer num2 = map.get(Integer.valueOf(open2.getIndex()));
                Intrinsics.checkNotNull(num2);
                open = new Open(num2.intValue(), z, 2, objArr == true ? 1 : 0);
            }
        } else {
            open = item;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(alphaRename$rename(map, (Scheme) it.next()));
        }
        Scheme schemeAlphaRename$rename = scheme2 != null ? alphaRename$rename(map, scheme2) : null;
        if (item == open) {
            List<Pair> listZip = CollectionsKt.zip(arrayList, list);
            if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
                for (Pair pair : listZip) {
                    if ((((Scheme) pair.component1()) != ((Scheme) pair.component2())) != false) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z && Intrinsics.areEqual(schemeAlphaRename$rename, scheme2)) {
                return scheme;
            }
        }
        return new Scheme(open, arrayList, schemeAlphaRename$rename, false, 8, null);
    }

    private static final void alphaRename$scan(Map<Integer, Integer> map, Ref.IntRef intRef, Scheme scheme) {
        Integer num;
        Item item = scheme.target;
        List<Scheme> list = scheme.parameters;
        Scheme scheme2 = scheme.result;
        if (item instanceof Open) {
            int index = ((Open) item).getIndex();
            if (!map.containsKey(Integer.valueOf(index))) {
                map.put(Integer.valueOf(index), -1);
            } else if (index >= 0 && (num = map.get(Integer.valueOf(index))) != null && num.intValue() == -1) {
                Integer numValueOf = Integer.valueOf(index);
                int i = intRef.element;
                intRef.element = i + 1;
                map.put(numValueOf, Integer.valueOf(i));
            }
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            alphaRename$scan(map, intRef, (Scheme) it.next());
        }
        if (scheme2 != null) {
            alphaRename$scan(map, intRef, scheme2);
        }
    }

    private final String getParametersStr() {
        return this.parameters.isEmpty() ? "" : o00O00OO.OooO00o(", ", CollectionsKt___CollectionsKt.joinToString$default(this.parameters, ", ", null, null, 0, null, new Function1<Scheme, CharSequence>() { // from class: androidx.compose.compiler.plugins.kotlin.inference.Scheme$parametersStr$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Scheme it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.toString();
            }
        }, 30, null));
    }

    private final String getResultStr() {
        Scheme scheme = this.result;
        if (scheme != null) {
            String str = ": " + scheme;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    private final int hashOfElements(List<Scheme> list) {
        if (list.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Scheme) it.next()).simpleHashCode()));
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        Object objPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            Object objPrevious2 = listIterator.previous();
            objPrevious = Integer.valueOf((((Number) objPrevious).intValue() * 31) + ((Number) objPrevious2).intValue());
        }
        return ((Number) objPrevious).intValue();
    }

    private final void serializeTo(SchemeStringSerializationWriter writer) {
        writer.writeOpen();
        this.target.serializeTo$compiler_hosted(writer);
        if (this.anyParameters) {
            writer.writeAnyParameters();
        } else {
            Iterator<T> it = this.parameters.iterator();
            while (it.hasNext()) {
                ((Scheme) it.next()).serializeTo(writer);
            }
        }
        if (this.result != null) {
            writer.writeResultPrefix();
            this.result.serializeTo(writer);
        }
        writer.writeClose();
    }

    private final boolean simpleCanOverride(Scheme other) {
        boolean z;
        Scheme scheme;
        Scheme scheme2;
        Item item = other.target;
        if (!(!(item instanceof Open) ? !(this.target.getIsUnspecified() || Intrinsics.areEqual(this.target, other.target)) : !((this.target instanceof Open) && ((Open) item).getIndex() == ((Open) this.target).getIndex()))) {
            return false;
        }
        List listZip = CollectionsKt.zip(this.parameters, other.parameters);
        if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
            Iterator it = listZip.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!((Scheme) pair.component1()).simpleCanOverride((Scheme) pair.component2())) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (z) {
            return Intrinsics.areEqual(this.result, other.result) || !((scheme = other.result) == null || (scheme2 = this.result) == null || !scheme2.canOverride(scheme));
        }
        return false;
    }

    private final boolean simpleEquals(Scheme other) {
        boolean z;
        if (!Intrinsics.areEqual(this.target, other.target)) {
            return false;
        }
        List listZip = CollectionsKt.zip(this.parameters, other.parameters);
        if (!(listZip instanceof Collection) || !listZip.isEmpty()) {
            Iterator it = listZip.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                Pair pair = (Pair) it.next();
                if (!Intrinsics.areEqual((Scheme) pair.component1(), (Scheme) pair.component2())) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z) {
            return false;
        }
        Scheme scheme = this.result;
        return Intrinsics.areEqual(scheme, scheme);
    }

    private final int simpleHashCode() {
        int iHashCode = (this.target.hashCode() * 31) + hashOfElements(this.parameters);
        Scheme scheme = this.result;
        return iHashCode + (scheme != null ? scheme.hashCode() : 0);
    }

    public final boolean canOverride(@NotNull Scheme other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return alphaRename().simpleCanOverride(other.alphaRename());
    }

    public boolean equals(@Nullable Object other) {
        Scheme scheme = other instanceof Scheme ? (Scheme) other : null;
        if (scheme == null) {
            return false;
        }
        return alphaRename().simpleEquals(scheme.alphaRename());
    }

    public final boolean getAnyParameters() {
        return this.anyParameters;
    }

    @NotNull
    public final List<Scheme> getParameters() {
        return this.parameters;
    }

    @Nullable
    public final Scheme getResult() {
        return this.result;
    }

    @NotNull
    public final Item getTarget() {
        return this.target;
    }

    public int hashCode() {
        return alphaRename().simpleHashCode();
    }

    @NotNull
    public final String serialize() {
        StringBuilder sb = new StringBuilder();
        serializeTo(new SchemeStringSerializationWriter(sb));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "[" + this.target + getParametersStr() + getResultStr() + "]";
    }

    public /* synthetic */ Scheme(Item item, List list, Scheme scheme, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(item, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : scheme, (i & 8) != 0 ? false : z);
    }
}
