package p245o00oo0O0;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.OooO00o;
import java.util.List;
import p247o00oo0Oo.o0000O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O00<T extends o0000O0, K extends OooO00o> extends BaseQuickAdapter<T, K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SparseIntArray f34188OooO00o;

    public o0O00(List<T> list) {
        super(list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final int getDefItemViewType(int i) {
        T t = this.mData.get(i);
        if (t instanceof o0000O0) {
            return t.OooO00o();
        }
        return -255;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final K onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        return createBaseViewHolder(viewGroup, this.f34188OooO00o.get(i, -404));
    }
}
