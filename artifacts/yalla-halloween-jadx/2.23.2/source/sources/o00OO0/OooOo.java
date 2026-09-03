package o00OO0;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public final class OooOo implements Oooo000, OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f37005OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path f37006OooO0O0 = new Path();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f37007OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f37008OooO0Oo = new ArrayList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final MergePaths f37009OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f37010OooO00o;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f37010OooO00o = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37010OooO00o[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37010OooO00o[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37010OooO00o[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37010OooO00o[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OooOo(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f37009OooO0o0 = mergePaths;
    }

    @Override // o00OO0.Oooo000
    public final Path OooO00o() {
        Path path = this.f37007OooO0OO;
        path.reset();
        MergePaths mergePaths = this.f37009OooO0o0;
        if (mergePaths.f11867OooO0O0) {
            return path;
        }
        int i = OooO00o.f37010OooO00o[mergePaths.f11866OooO00o.ordinal()];
        if (i == 1) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f37008OooO0Oo;
                if (i2 >= arrayList.size()) {
                    break;
                }
                path.addPath(((Oooo000) arrayList.get(i2)).OooO00o());
                i2++;
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
        return path;
    }

    @TargetApi(19)
    public final void OooO0O0(Path.Op op) {
        Matrix matrixOooO0Oo;
        Matrix matrixOooO0Oo2;
        Path path = this.f37006OooO0O0;
        path.reset();
        Path path2 = this.f37005OooO00o;
        path2.reset();
        ArrayList arrayList = this.f37008OooO0Oo;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            Oooo000 oooo000 = (Oooo000) arrayList.get(size);
            if (oooo000 instanceof OooO0o) {
                OooO0o oooO0o = (OooO0o) oooo000;
                ArrayList arrayList2 = (ArrayList) oooO0o.OooO0oO();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathOooO00o = ((Oooo000) arrayList2.get(size2)).OooO00o();
                    o00OO0O0.o0OoOo0 o0oooo1 = oooO0o.f36951OooOO0O;
                    if (o0oooo1 != null) {
                        matrixOooO0Oo2 = o0oooo1.OooO0Oo();
                    } else {
                        matrixOooO0Oo2 = oooO0o.f36944OooO0OO;
                        matrixOooO0Oo2.reset();
                    }
                    pathOooO00o.transform(matrixOooO0Oo2);
                    path.addPath(pathOooO00o);
                }
            } else {
                path.addPath(oooo000.OooO00o());
            }
        }
        int i = 0;
        Oooo000 oooo001 = (Oooo000) arrayList.get(0);
        if (oooo001 instanceof OooO0o) {
            OooO0o oooO0o2 = (OooO0o) oooo001;
            List<Oooo000> listOooO0oO = oooO0o2.OooO0oO();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listOooO0oO;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathOooO00o2 = ((Oooo000) arrayList3.get(i)).OooO00o();
                o00OO0O0.o0OoOo0 o0oooo2 = oooO0o2.f36951OooOO0O;
                if (o0oooo2 != null) {
                    matrixOooO0Oo = o0oooo2.OooO0Oo();
                } else {
                    matrixOooO0Oo = oooO0o2.f36944OooO0OO;
                    matrixOooO0Oo.reset();
                }
                pathOooO00o2.transform(matrixOooO0Oo);
                path2.addPath(pathOooO00o2);
                i++;
            }
        } else {
            path2.set(oooo001.OooO00o());
        }
        this.f37007OooO0OO.op(path2, path, op);
    }

    @Override // o00OO0.OooO0OO
    public final void OooO0OO(List<OooO0OO> list, List<OooO0OO> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37008OooO0Oo;
            if (i >= arrayList.size()) {
                return;
            }
            ((Oooo000) arrayList.get(i)).OooO0OO(list, list2);
            i++;
        }
    }

    @Override // o00OO0.OooOOOO
    public final void OooO0oO(ListIterator<OooO0OO> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            OooO0OO oooO0OOPrevious = listIterator.previous();
            if (oooO0OOPrevious instanceof Oooo000) {
                this.f37008OooO0Oo.add((Oooo000) oooO0OOPrevious);
                listIterator.remove();
            }
        }
    }
}
