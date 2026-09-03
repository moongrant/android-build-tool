package p188o00o00o0;

import android.content.Context;
import android.widget.Button;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.Function.OooO0O0;
import com.app.base.view.StatusView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0OOO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO<T> extends BaseQuickAdapter<T, OooO0o> {
    private Context context;
    private StatusView emptyHolderView;
    private boolean hindEmpty;
    private o0OOO0o mXLoadMoreView;

    public OooO0OO(Context context, int i, @Nullable List<T> list) {
        super(i, list);
        this.hindEmpty = false;
        this.context = context;
        initAdapter();
    }

    private void initAdapter() {
        setPreLoadNumber(4);
        if (this.mXLoadMoreView == null) {
            this.mXLoadMoreView = new o0OOO0o();
        }
        setLoadMoreView(this.mXLoadMoreView);
        initEmptyView();
        setHeaderAndEmpty(true);
    }

    private void initEmptyView() {
        if (this.context != null) {
            StatusView statusView = new StatusView(this.context);
            this.emptyHolderView = statusView;
            statusView.OooO0Oo(true);
            StatusView statusView2 = this.emptyHolderView;
            statusView2.f12133Oooooo0 = true;
            OooO0O0 oooO0O0 = statusView2.f12132Oooooo;
            if (oooO0O0 != null) {
                oooO0O0.OooO0O0();
            }
            setEmptyView(this.emptyHolderView);
        }
    }

    public Context getContext() {
        return this.context;
    }

    public StatusView getEmptyHolderView() {
        return this.emptyHolderView;
    }

    public void hindEmptyView(boolean z) {
        this.hindEmpty = z;
        if (z) {
            StatusView statusView = this.emptyHolderView;
            statusView.OooO0o0(false);
            statusView.OooO00o(false);
            statusView.OooO0OO(false);
        }
    }

    public void loadError() {
        if (this.hindEmpty) {
            return;
        }
        setEnableLoadMore(false);
        this.emptyHolderView.OooO0Oo(false);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(getData())) {
            this.emptyHolderView.OooO0O0();
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void setEmptyBackground(int i) {
        this.emptyHolderView.setEmptyBackground(i);
    }

    public void setEmptyButtonText(int i) {
        this.emptyHolderView.setEmptyButtonText(i);
    }

    public void setEmptyFullScreen(boolean z) {
        if (getEmptyView() != null) {
            getEmptyView().getLayoutParams().height = z ? -1 : -2;
        }
    }

    public void setEmptyImageRes(@DrawableRes int i) {
        this.emptyHolderView.setEmptyImageRes(i);
    }

    public void setEmptyText(@StringRes int i) {
        this.emptyHolderView.setEmptyText(i);
    }

    public void setEmptyTextColor(@ColorRes int i) {
        this.emptyHolderView.setEmptyTextColor(i);
    }

    public void setErrorImage(int i) {
        this.emptyHolderView.setErrorImage(i);
    }

    public void setFirstLoading(boolean z) {
        this.emptyHolderView.OooO0Oo(z);
    }

    public void setLoadComplete() {
        if (this.hindEmpty) {
            return;
        }
        this.emptyHolderView.OooO0Oo(false);
        if (com.yalla.support.common.util.OooO0OO.OooO00o(getData())) {
            StatusView statusView = this.emptyHolderView;
            statusView.OooO00o(true);
            statusView.OooO0o0(false);
            statusView.OooO0OO(false);
        }
    }

    public void setLoadEndHint(String loadEndHint) {
        o0OOO0o o0ooo0o2 = this.mXLoadMoreView;
        if (o0ooo0o2 != null) {
            Objects.requireNonNull(o0ooo0o2);
            Intrinsics.checkNotNullParameter(loadEndHint, "loadEndHint");
            o0ooo0o2.f33036OooO0Oo = loadEndHint;
        }
    }

    public void setLoadErrorClickListener(o00Oo0 o00oo1) {
        this.emptyHolderView.setOnErrorClickListener(o00oo1);
    }

    public void setOnEmptyClickListener(o00Oo0 o00oo1) {
        this.emptyHolderView.setOnEmptyClickListener(o00oo1);
    }

    public void showEmptyButton(boolean z) {
        StatusView statusView = this.emptyHolderView;
        statusView.f12127Ooooo00 = z;
        Button button = statusView.f12117OoooO;
        if (button != null) {
            button.setVisibility(z ? 0 : 8);
        }
    }

    public OooO0OO(Context context, @Nullable List<T> list) {
        super(list);
        this.hindEmpty = false;
        this.context = context;
        initAdapter();
    }

    public void setLoadComplete(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool.booleanValue()) {
            if (bool2.booleanValue()) {
                setLoadComplete();
                if (bool3.booleanValue()) {
                    loadMoreEnd();
                    return;
                }
                return;
            }
            loadError();
            return;
        }
        if (bool2.booleanValue()) {
            if (bool3.booleanValue()) {
                loadMoreEnd();
                return;
            } else {
                loadMoreComplete();
                return;
            }
        }
        loadMoreFail();
    }

    public OooO0OO(Context context, int i) {
        super(i);
        this.hindEmpty = false;
        this.context = context;
        initAdapter();
    }

    public OooO0OO(Context context, int i, boolean z) {
        super(i);
        this.hindEmpty = false;
        this.context = context;
        if (z) {
            initAdapter();
        } else {
            this.hindEmpty = true;
        }
    }

    public void setLoadComplete(boolean z) {
        if (z) {
            setLoadComplete();
        } else {
            loadError();
        }
    }
}
