package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f6689OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CheckedTextView f6690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f6691OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CheckedTextView f6692OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f6693OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6694OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CheckedTextView[][] f6695OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f6696OooOO0O;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f6690OooO0Oo;
            HashMap map = trackSelectionView.f6693OooO0oO;
            if (view == checkedTextView) {
                trackSelectionView.f6696OooOO0O = true;
                map.clear();
            } else {
                if (view != trackSelectionView.f6692OooO0o0) {
                    trackSelectionView.f6696OooOO0O = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    throw null;
                }
                trackSelectionView.f6696OooOO0O = false;
                map.clear();
            }
            trackSelectionView.OooO00o();
        }
    }

    public static final class OooO0O0 {
        public OooO0O0() {
            throw null;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        this.f6690OooO0Oo.setChecked(this.f6696OooOO0O);
        boolean z = this.f6696OooOO0O;
        HashMap map = this.f6693OooO0oO;
        this.f6692OooO0o0.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f6695OooOO0.length; i++) {
            ((o0000ooO.o00000OO.OooO00o) this.f6691OooO0o.get(i)).getClass();
            p069o0000ooO.o00000O0 o00000o1 = (p069o0000ooO.o00000O0) map.get(null);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f6695OooOO0[i];
                if (i2 < checkedTextViewArr.length) {
                    if (o00000o1 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        CheckedTextView checkedTextView = this.f6695OooOO0[i][i2];
                        o00000o1.getClass();
                        throw null;
                    }
                    checkedTextViewArr[i2].setChecked(false);
                    i2++;
                }
            }
        }
    }

    public final void OooO0O0() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f6691OooO0o;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f6692OooO0o0;
        CheckedTextView checkedTextView2 = this.f6690OooO0Oo;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f6695OooOO0 = new CheckedTextView[arrayList.size()][];
        if (this.f6689OooO) {
            arrayList.size();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o0000ooO.o00000OO.OooO00o oooO00o = (o0000ooO.o00000OO.OooO00o) arrayList.get(i);
            if (this.f6694OooO0oo) {
                oooO00o.getClass();
            }
            CheckedTextView[][] checkedTextViewArr = this.f6695OooOO0;
            oooO00o.getClass();
            checkedTextViewArr[i] = new CheckedTextView[0];
        }
        OooO00o();
    }

    public boolean getIsDisabled() {
        return this.f6696OooOO0O;
    }

    public Map<Object, p069o0000ooO.o00000O0> getOverrides() {
        return this.f6693OooO0oO;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f6694OooO0oo != z) {
            this.f6694OooO0oo = z;
            OooO0O0();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f6689OooO != z) {
            this.f6689OooO = z;
            if (!z) {
                HashMap map = this.f6693OooO0oO;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f6691OooO0o;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        ((o0000ooO.o00000OO.OooO00o) arrayList.get(i)).getClass();
                        p069o0000ooO.o00000O0 o00000o1 = (p069o0000ooO.o00000O0) map.get(null);
                        if (o00000o1 != null && map2.isEmpty()) {
                            map2.put(null, o00000o1);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            OooO0O0();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f6690OooO0Oo.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(o000O0o o000o0o2) {
        o000o0o2.getClass();
        OooO0O0();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        OooO00o oooO00o = new OooO00o();
        new OooO0OO(getResources());
        this.f6691OooO0o = new ArrayList();
        this.f6693OooO0oO = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6690OooO0Oo = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(o0000.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(oooO00o);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(o00000OO.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f6692OooO0o0 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(o0000.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(oooO00o);
        addView(checkedTextView2);
    }
}
