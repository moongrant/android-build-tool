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
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f9772OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9773OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CheckedTextView f9774OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LayoutInflater f9775OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CheckedTextView f9776OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f9777OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f9778OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f9779OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f9780OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public CheckedTextView[][] f9781OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000O0o f9782OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f9783OooOOOO;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f9774OooO0o;
            HashMap map = trackSelectionView.f9778OooOO0;
            boolean z = true;
            if (view == checkedTextView) {
                trackSelectionView.f9783OooOOOO = true;
                map.clear();
            } else if (view == trackSelectionView.f9776OooO0oO) {
                trackSelectionView.f9783OooOOOO = false;
                map.clear();
            } else {
                trackSelectionView.f9783OooOOOO = false;
                Object tag = view.getTag();
                tag.getClass();
                OooO0O0 oooO0O0 = (OooO0O0) tag;
                androidx.media3.common.o000oOoO o000oooo2 = oooO0O0.f9785OooO00o.f6860OooO0o0;
                androidx.media3.common.o0OoOo0 o0oooo1 = (androidx.media3.common.o0OoOo0) map.get(o000oooo2);
                int i = oooO0O0.f9786OooO0O0;
                if (o0oooo1 == null) {
                    if (!trackSelectionView.f9780OooOO0o && map.size() > 0) {
                        map.clear();
                    }
                    map.put(o000oooo2, new androidx.media3.common.o0OoOo0(o000oooo2, ImmutableList.OooOOOo(Integer.valueOf(i))));
                } else {
                    ArrayList arrayList = new ArrayList(o0oooo1.f6877OooO0o0);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z2 = trackSelectionView.f9779OooOO0O && oooO0O0.f9785OooO00o.f6859OooO0o;
                    if (!z2) {
                        if (!(trackSelectionView.f9780OooOO0o && trackSelectionView.f9772OooO.size() > 1)) {
                            z = false;
                        }
                    }
                    if (zIsChecked && z) {
                        arrayList.remove(Integer.valueOf(i));
                        if (arrayList.isEmpty()) {
                            map.remove(o000oooo2);
                        } else {
                            map.put(o000oooo2, new androidx.media3.common.o0OoOo0(o000oooo2, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z2) {
                            arrayList.add(Integer.valueOf(i));
                            map.put(o000oooo2, new androidx.media3.common.o0OoOo0(o000oooo2, arrayList));
                        } else {
                            map.put(o000oooo2, new androidx.media3.common.o0OoOo0(o000oooo2, ImmutableList.OooOOOo(Integer.valueOf(i))));
                        }
                    }
                }
            }
            trackSelectionView.OooO00o();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.common.o00Oo0.OooO00o f9785OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f9786OooO0O0;

        public OooO0O0(androidx.media3.common.o00Oo0.OooO00o oooO00o, int i) {
            this.f9785OooO00o = oooO00o;
            this.f9786OooO0O0 = i;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        this.f9774OooO0o.setChecked(this.f9783OooOOOO);
        boolean z = this.f9783OooOOOO;
        HashMap map = this.f9778OooOO0;
        this.f9776OooO0oO.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f9781OooOOO.length; i++) {
            androidx.media3.common.o0OoOo0 o0oooo1 = (androidx.media3.common.o0OoOo0) map.get(((androidx.media3.common.o00Oo0.OooO00o) this.f9772OooO.get(i)).f6860OooO0o0);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f9781OooOOO[i];
                if (i2 < checkedTextViewArr.length) {
                    if (o0oooo1 != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f9781OooOOO[i][i2].setChecked(o0oooo1.f6877OooO0o0.contains(Integer.valueOf(((OooO0O0) tag).f9786OooO0O0)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void OooO0O0() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f9772OooO;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f9776OooO0oO;
        CheckedTextView checkedTextView2 = this.f9774OooO0o;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f9781OooOOO = new CheckedTextView[arrayList.size()][];
        boolean z = this.f9780OooOO0o && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.media3.common.o00Oo0.OooO00o oooO00o = (androidx.media3.common.o00Oo0.OooO00o) arrayList.get(i);
            boolean z2 = this.f9779OooOO0O && oooO00o.f6859OooO0o;
            CheckedTextView[][] checkedTextViewArr = this.f9781OooOOO;
            int i2 = oooO00o.f6858OooO0Oo;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            OooO0O0[] oooO0O0Arr = new OooO0O0[i2];
            for (int i3 = 0; i3 < oooO00o.f6858OooO0Oo; i3++) {
                oooO0O0Arr[i3] = new OooO0O0(oooO00o, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.f9775OooO0o0;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(o0000Ooo.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f9773OooO0Oo);
                o000O0o o000o0o2 = this.f9782OooOOO0;
                OooO0O0 oooO0O0 = oooO0O0Arr[i4];
                checkedTextView3.setText(o000o0o2.OooO00o(oooO0O0.f9785OooO00o.f6860OooO0o0.f6768OooO0oO[oooO0O0.f9786OooO0O0]));
                checkedTextView3.setTag(oooO0O0Arr[i4]);
                if (oooO00o.OooO0o(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f9777OooO0oo);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f9781OooOOO[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        OooO00o();
    }

    public boolean getIsDisabled() {
        return this.f9783OooOOOO;
    }

    public Map<androidx.media3.common.o000oOoO, androidx.media3.common.o0OoOo0> getOverrides() {
        return this.f9778OooOO0;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f9779OooOO0O != z) {
            this.f9779OooOO0O = z;
            OooO0O0();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f9780OooOO0o != z) {
            this.f9780OooOO0o = z;
            if (!z) {
                HashMap map = this.f9778OooOO0;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f9772OooO;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        androidx.media3.common.o0OoOo0 o0oooo1 = (androidx.media3.common.o0OoOo0) map.get(((androidx.media3.common.o00Oo0.OooO00o) arrayList.get(i)).f6860OooO0o0);
                        if (o0oooo1 != null && map2.isEmpty()) {
                            map2.put(o0oooo1.f6876OooO0Oo, o0oooo1);
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
        this.f9774OooO0o.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(o000O0o o000o0o2) {
        o000o0o2.getClass();
        this.f9782OooOOO0 = o000o0o2;
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
        this.f9773OooO0Oo = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f9775OooO0o0 = layoutInflaterFrom;
        OooO00o oooO00o = new OooO00o();
        this.f9777OooO0oo = oooO00o;
        this.f9782OooOOO0 = new OooO0o(getResources());
        this.f9772OooO = new ArrayList();
        this.f9778OooOO0 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9774OooO0o = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(o0000O00.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(oooO00o);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(o0000Ooo.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f9776OooO0oO = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(o0000O00.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(oooO00o);
        addView(checkedTextView2);
    }
}
