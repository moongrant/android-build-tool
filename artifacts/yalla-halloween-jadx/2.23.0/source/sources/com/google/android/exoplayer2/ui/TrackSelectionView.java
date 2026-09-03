package com.google.android.exoplayer2.ui;

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
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p226o00oOo00.o000O00O;
import p241o00oo0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f14010OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f14011OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CheckedTextView f14012OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LayoutInflater f14013OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CheckedTextView f14014OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f14015OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f14016OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f14017OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14018OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public CheckedTextView[][] f14019OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0000O0O f14020OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14021OooOOOO;

    public class OooO00o implements View.OnClickListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f14012OooO0o;
            HashMap map = trackSelectionView.f14016OooOO0;
            boolean z = true;
            if (view == checkedTextView) {
                trackSelectionView.f14021OooOOOO = true;
                map.clear();
            } else if (view == trackSelectionView.f14014OooO0oO) {
                trackSelectionView.f14021OooOOOO = false;
                map.clear();
            } else {
                trackSelectionView.f14021OooOOOO = false;
                Object tag = view.getTag();
                tag.getClass();
                OooO0O0 oooO0O0 = (OooO0O0) tag;
                o000O00O o000o00o2 = oooO0O0.f14023OooO00o.f12839OooO0o0;
                o0O0ooO o0o0ooo = (o0O0ooO) map.get(o000o00o2);
                int i = oooO0O0.f14024OooO0O0;
                if (o0o0ooo == null) {
                    if (!trackSelectionView.f14018OooOO0o && map.size() > 0) {
                        map.clear();
                    }
                    map.put(o000o00o2, new o0O0ooO(o000o00o2, ImmutableList.OooOOOo(Integer.valueOf(i))));
                } else {
                    ArrayList arrayList = new ArrayList(o0o0ooo.f40412OooO0o0);
                    boolean zIsChecked = ((CheckedTextView) view).isChecked();
                    boolean z2 = trackSelectionView.f14017OooOO0O && oooO0O0.f14023OooO00o.f12838OooO0o;
                    if (!z2) {
                        if (!(trackSelectionView.f14018OooOO0o && trackSelectionView.f14010OooO.size() > 1)) {
                            z = false;
                        }
                    }
                    if (zIsChecked && z) {
                        arrayList.remove(Integer.valueOf(i));
                        if (arrayList.isEmpty()) {
                            map.remove(o000o00o2);
                        } else {
                            map.put(o000o00o2, new o0O0ooO(o000o00o2, arrayList));
                        }
                    } else if (!zIsChecked) {
                        if (z2) {
                            arrayList.add(Integer.valueOf(i));
                            map.put(o000o00o2, new o0O0ooO(o000o00o2, arrayList));
                        } else {
                            map.put(o000o00o2, new o0O0ooO(o000o00o2, ImmutableList.OooOOOo(Integer.valueOf(i))));
                        }
                    }
                }
            }
            trackSelectionView.OooO00o();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.o0O0O00.OooO00o f14023OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14024OooO0O0;

        public OooO0O0(com.google.android.exoplayer2.o0O0O00.OooO00o oooO00o, int i) {
            this.f14023OooO00o = oooO00o;
            this.f14024OooO0O0 = i;
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        this.f14012OooO0o.setChecked(this.f14021OooOOOO);
        boolean z = this.f14021OooOOOO;
        HashMap map = this.f14016OooOO0;
        this.f14014OooO0oO.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.f14019OooOOO.length; i++) {
            o0O0ooO o0o0ooo = (o0O0ooO) map.get(((com.google.android.exoplayer2.o0O0O00.OooO00o) this.f14010OooO.get(i)).f12839OooO0o0);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f14019OooOOO[i];
                if (i2 < checkedTextViewArr.length) {
                    if (o0o0ooo != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.f14019OooOOO[i][i2].setChecked(o0o0ooo.f40412OooO0o0.contains(Integer.valueOf(((OooO0O0) tag).f14024OooO0O0)));
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
        ArrayList arrayList = this.f14010OooO;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f14014OooO0oO;
        CheckedTextView checkedTextView2 = this.f14012OooO0o;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f14019OooOOO = new CheckedTextView[arrayList.size()][];
        boolean z = this.f14018OooOO0o && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            com.google.android.exoplayer2.o0O0O00.OooO00o oooO00o = (com.google.android.exoplayer2.o0O0O00.OooO00o) arrayList.get(i);
            boolean z2 = this.f14017OooOO0O && oooO00o.f12838OooO0o;
            CheckedTextView[][] checkedTextViewArr = this.f14019OooOOO;
            int i2 = oooO00o.f12837OooO0Oo;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            OooO0O0[] oooO0O0Arr = new OooO0O0[i2];
            for (int i3 = 0; i3 < oooO00o.f12837OooO0Oo; i3++) {
                oooO0O0Arr[i3] = new OooO0O0(oooO00o, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.f14013OooO0o0;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(OooOo.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f14011OooO0Oo);
                o0000O0O o0000o0o2 = this.f14020OooOOO0;
                OooO0O0 oooO0O0 = oooO0O0Arr[i4];
                checkedTextView3.setText(o0000o0o2.OooO00o(oooO0O0.f14023OooO00o.f12839OooO0o0.f39876OooO0oO[oooO0O0.f14024OooO0O0]));
                checkedTextView3.setTag(oooO0O0Arr[i4]);
                if (oooO00o.OooO0Oo(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f14015OooO0oo);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f14019OooOOO[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        OooO00o();
    }

    public boolean getIsDisabled() {
        return this.f14021OooOOOO;
    }

    public Map<o000O00O, o0O0ooO> getOverrides() {
        return this.f14016OooOO0;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f14017OooOO0O != z) {
            this.f14017OooOO0O = z;
            OooO0O0();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f14018OooOO0o != z) {
            this.f14018OooOO0o = z;
            if (!z) {
                HashMap map = this.f14016OooOO0;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f14010OooO;
                    HashMap map2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        o0O0ooO o0o0ooo = (o0O0ooO) map.get(((com.google.android.exoplayer2.o0O0O00.OooO00o) arrayList.get(i)).f12839OooO0o0);
                        if (o0o0ooo != null && map2.isEmpty()) {
                            map2.put(o0o0ooo.f40411OooO0Oo, o0o0ooo);
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
        this.f14012OooO0o.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(o0000O0O o0000o0o2) {
        o0000o0o2.getClass();
        this.f14020OooOOO0 = o0000o0o2;
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
        this.f14011OooO0Oo = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f14013OooO0o0 = layoutInflaterFrom;
        OooO00o oooO00o = new OooO00o();
        this.f14015OooO0oo = oooO00o;
        this.f14020OooOOO0 = new OooO0OO(getResources());
        this.f14010OooO = new ArrayList();
        this.f14016OooOO0 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14012OooO0o = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(Oooo0.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(oooO00o);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(OooOo.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f14014OooO0oO = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(Oooo0.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(oooO00o);
        addView(checkedTextView2);
    }
}
