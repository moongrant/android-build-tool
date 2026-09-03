package p118o00O0Oo;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p120o00O0OoO.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public final class o000oOoO implements o0OoOo0, Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30691OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f30692OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f30693OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o0OoOo0> f30694OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MergePaths f30695OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f30696OooO00o;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f30696OooO00o = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30696OooO00o[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30696OooO00o[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30696OooO00o[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30696OooO00o[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public o000oOoO(MergePaths mergePaths) {
        Objects.requireNonNull(mergePaths);
        this.f30695OooO0o0 = mergePaths;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        this.f30693OooO0OO.reset();
        MergePaths mergePaths = this.f30695OooO0o0;
        if (mergePaths.f10097OooO0OO) {
            return this.f30693OooO0OO;
        }
        int i = OooO00o.f30696OooO00o[mergePaths.f10096OooO0O0.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f30694OooO0Oo.size(); i2++) {
                this.f30693OooO0OO.addPath(((o0OoOo0) this.f30694OooO0Oo.get(i2)).OooO00o());
            }
        } else if (i == 2) {
            OooO0O0(Path.Op.UNION);
        } else if (i == 3) {
            OooO0O0(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            OooO0O0(Path.Op.INTERSECT);
        } else if (i == 5) {
            OooO0O0(Path.Op.XOR);
        }
        return this.f30693OooO0OO;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @TargetApi(19)
    public final void OooO0O0(Path.Op op) {
        Matrix matrixOooO0o0;
        Matrix matrixOooO0o1;
        this.f30692OooO0O0.reset();
        this.f30691OooO00o.reset();
        for (int size = this.f30694OooO0Oo.size() - 1; size >= 1; size--) {
            o0OoOo0 o0oooo1 = (o0OoOo0) this.f30694OooO0Oo.get(size);
            if (o0oooo1 instanceof OooOO0O) {
                OooOO0O oooOO0O = (OooOO0O) o0oooo1;
                ArrayList arrayList = (ArrayList) oooOO0O.OooO0oO();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    Path pathOooO00o = ((o0OoOo0) arrayList.get(size2)).OooO00o();
                    o0ooOOo o0ooooo2 = oooOO0O.f30637OooOO0O;
                    if (o0ooooo2 != null) {
                        matrixOooO0o1 = o0ooooo2.OooO0o0();
                    } else {
                        oooOO0O.f30630OooO0OO.reset();
                        matrixOooO0o1 = oooOO0O.f30630OooO0OO;
                    }
                    pathOooO00o.transform(matrixOooO0o1);
                    this.f30692OooO0O0.addPath(pathOooO00o);
                }
            } else {
                this.f30692OooO0O0.addPath(o0oooo1.OooO00o());
            }
        }
        int i = 0;
        o0OoOo0 o0oooo2 = (o0OoOo0) this.f30694OooO0Oo.get(0);
        if (o0oooo2 instanceof OooOO0O) {
            OooOO0O oooOO0O2 = (OooOO0O) o0oooo2;
            List<o0OoOo0> listOooO0oO = oooOO0O2.OooO0oO();
            while (true) {
                ArrayList arrayList2 = (ArrayList) listOooO0oO;
                if (i >= arrayList2.size()) {
                    break;
                }
                Path pathOooO00o2 = ((o0OoOo0) arrayList2.get(i)).OooO00o();
                o0ooOOo o0ooooo3 = oooOO0O2.f30637OooOO0O;
                if (o0ooooo3 != null) {
                    matrixOooO0o0 = o0ooooo3.OooO0o0();
                } else {
                    oooOO0O2.f30630OooO0OO.reset();
                    matrixOooO0o0 = oooOO0O2.f30630OooO0OO;
                }
                pathOooO00o2.transform(matrixOooO0o0);
                this.f30691OooO00o.addPath(pathOooO00o2);
                i++;
            }
        } else {
            this.f30691OooO00o.set(o0oooo2.OooO00o());
        }
        this.f30693OooO0OO.op(this.f30691OooO00o, this.f30692OooO0O0, op);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        for (int i = 0; i < this.f30694OooO0Oo.size(); i++) {
            ((o0OoOo0) this.f30694OooO0Oo.get(i)).OooO0OO(list, list2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00O0Oo.o0OoOo0>] */
    @Override // p118o00O0Oo.Oooo000
    public final void OooO0oO(ListIterator<OooOO0> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            OooOO0 oooOO0Previous = listIterator.previous();
            if (oooOO0Previous instanceof o0OoOo0) {
                this.f30694OooO0Oo.add((o0OoOo0) oooOO0Previous);
                listIterator.remove();
            }
        }
    }
}
