package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends oo0o0Oo implements DialogInterface {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AlertController f2393OooO0o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AlertController.OooO0O0 f2394OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f2395OooO0O0;

        public OooO00o(@NonNull Context context) {
            this(context, OooO0O0.OooO0oO(0, context));
        }

        @NonNull
        public OooO0O0 create() {
            AlertController.OooO0O0 oooO0O0 = this.f2394OooO00o;
            OooO0O0 oooO0O1 = new OooO0O0(oooO0O0.f2270OooO00o, this.f2395OooO0O0);
            View view = oooO0O0.f2275OooO0o0;
            AlertController alertController = oooO0O1.f2393OooO0o;
            if (view != null) {
                alertController.f2259OooOoo0 = view;
            } else {
                CharSequence charSequence = oooO0O0.f2273OooO0Oo;
                if (charSequence != null) {
                    alertController.f2237OooO0o0 = charSequence;
                    TextView textView = alertController.f2255OooOoO;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = oooO0O0.f2272OooO0OO;
                if (drawable != null) {
                    alertController.f2250OooOo = drawable;
                    alertController.f2254OooOo0o = 0;
                    ImageView imageView = alertController.f2256OooOoO0;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f2256OooOoO0.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = oooO0O0.f2274OooO0o;
            if (charSequence2 != null) {
                alertController.OooO0Oo(-1, charSequence2, oooO0O0.f2276OooO0oO);
            }
            CharSequence charSequence3 = oooO0O0.f2277OooO0oo;
            if (charSequence3 != null) {
                alertController.OooO0Oo(-2, charSequence3, oooO0O0.f2269OooO);
            }
            if (oooO0O0.f2279OooOO0O != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) oooO0O0.f2271OooO0O0.inflate(alertController.f2263Oooo000, (ViewGroup) null);
                int i = oooO0O0.f2281OooOOO ? alertController.f2264Oooo00O : alertController.f2265Oooo00o;
                ListAdapter oooO0o = oooO0O0.f2279OooOO0O;
                if (oooO0o == null) {
                    oooO0o = new AlertController.OooO0o(oooO0O0.f2270OooO00o, i);
                }
                alertController.f2258OooOoo = oooO0o;
                alertController.f2260OooOooO = oooO0O0.f2283OooOOOO;
                if (oooO0O0.f2280OooOO0o != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.OooO00o(oooO0O0, alertController));
                }
                if (oooO0O0.f2281OooOOO) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f2236OooO0o = recycleListView;
            }
            View view2 = oooO0O0.f2282OooOOO0;
            if (view2 != null) {
                alertController.f2238OooO0oO = view2;
                alertController.f2239OooO0oo = 0;
                alertController.f2231OooO = false;
            }
            oooO0O1.setCancelable(true);
            oooO0O1.setCanceledOnTouchOutside(true);
            oooO0O1.setOnCancelListener(null);
            oooO0O1.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = oooO0O0.f2278OooOO0;
            if (onKeyListener != null) {
                oooO0O1.setOnKeyListener(onKeyListener);
            }
            return oooO0O1;
        }

        @NonNull
        public Context getContext() {
            return this.f2394OooO00o.f2270OooO00o;
        }

        public OooO00o setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f2394OooO00o;
            oooO0O0.f2277OooO0oo = oooO0O0.f2270OooO00o.getText(i);
            oooO0O0.f2269OooO = onClickListener;
            return this;
        }

        public OooO00o setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.OooO0O0 oooO0O0 = this.f2394OooO00o;
            oooO0O0.f2274OooO0o = oooO0O0.f2270OooO00o.getText(i);
            oooO0O0.f2276OooO0oO = onClickListener;
            return this;
        }

        public OooO00o setTitle(@Nullable CharSequence charSequence) {
            this.f2394OooO00o.f2273OooO0Oo = charSequence;
            return this;
        }

        public OooO00o setView(View view) {
            this.f2394OooO00o.f2282OooOOO0 = view;
            return this;
        }

        public OooO00o(@NonNull Context context, @StyleRes int i) {
            this.f2394OooO00o = new AlertController.OooO0O0(new ContextThemeWrapper(context, OooO0O0.OooO0oO(i, context)));
            this.f2395OooO0O0 = i;
        }
    }

    public OooO0O0(@NonNull Context context, @StyleRes int i) {
        super(context, OooO0oO(i, context));
        this.f2393OooO0o = new AlertController(getContext(), this, getWindow());
    }

    public static int OooO0oO(@StyleRes int i, @NonNull Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.oo0o0Oo, androidx.activity.OooOo00, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f2393OooO0o;
        alertController.f2233OooO0O0.setContentView(alertController.f2261OooOooo);
        int i3 = p012OooOo0O.Oooo000.parentPanel;
        Window window = alertController.f2234OooO0OO;
        View viewFindViewById2 = window.findViewById(i3);
        int i4 = p012OooOo0O.Oooo000.topPanel;
        View viewFindViewById3 = viewFindViewById2.findViewById(i4);
        int i5 = p012OooOo0O.Oooo000.contentPanel;
        View viewFindViewById4 = viewFindViewById2.findViewById(i5);
        int i6 = p012OooOo0O.Oooo000.buttonPanel;
        View viewFindViewById5 = viewFindViewById2.findViewById(i6);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(p012OooOo0O.Oooo000.customPanel);
        View viewInflate = alertController.f2238OooO0oO;
        Context context = alertController.f2232OooO00o;
        if (viewInflate == null) {
            viewInflate = alertController.f2239OooO0oo != 0 ? LayoutInflater.from(context).inflate(alertController.f2239OooO0oo, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.OooO00o(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(p012OooOo0O.Oooo000.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f2231OooO) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f2236OooO0o != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(i4);
        View viewFindViewById7 = viewGroup.findViewById(i5);
        View viewFindViewById8 = viewGroup.findViewById(i6);
        ViewGroup viewGroupOooO0OO = AlertController.OooO0OO(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupOooO0OO2 = AlertController.OooO0OO(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupOooO0OO3 = AlertController.OooO0OO(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(p012OooOo0O.Oooo000.scrollView);
        alertController.f2253OooOo0O = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f2253OooOo0O.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupOooO0OO2.findViewById(R.id.message);
        alertController.f2257OooOoOO = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f2253OooOo0O.removeView(alertController.f2257OooOoOO);
            if (alertController.f2236OooO0o != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f2253OooOo0O.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(alertController.f2253OooOo0O);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(alertController.f2236OooO0o, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupOooO0OO2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupOooO0OO3.findViewById(R.id.button1);
        alertController.f2240OooOO0 = button;
        AlertController.OooO00o oooO00o = alertController.f2267Oooo0OO;
        button.setOnClickListener(oooO00o);
        boolean zIsEmpty = TextUtils.isEmpty(alertController.f2241OooOO0O);
        int i7 = alertController.f2235OooO0Oo;
        if (zIsEmpty && alertController.f2244OooOOO0 == null) {
            alertController.f2240OooOO0.setVisibility(8);
            i = 0;
        } else {
            alertController.f2240OooOO0.setText(alertController.f2241OooOO0O);
            Drawable drawable = alertController.f2244OooOOO0;
            if (drawable != null) {
                drawable.setBounds(0, 0, i7, i7);
                alertController.f2240OooOO0.setCompoundDrawables(alertController.f2244OooOOO0, null, null, null);
            }
            alertController.f2240OooOO0.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupOooO0OO3.findViewById(R.id.button2);
        alertController.f2243OooOOO = button2;
        button2.setOnClickListener(oooO00o);
        if (TextUtils.isEmpty(alertController.f2245OooOOOO) && alertController.f2248OooOOo0 == null) {
            alertController.f2243OooOOO.setVisibility(8);
        } else {
            alertController.f2243OooOOO.setText(alertController.f2245OooOOOO);
            Drawable drawable2 = alertController.f2248OooOOo0;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i7, i7);
                alertController.f2243OooOOO.setCompoundDrawables(alertController.f2248OooOOo0, null, null, null);
            }
            alertController.f2243OooOOO.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupOooO0OO3.findViewById(R.id.button3);
        alertController.f2247OooOOo = button3;
        button3.setOnClickListener(oooO00o);
        if (TextUtils.isEmpty(alertController.f2249OooOOoo) && alertController.f2251OooOo0 == null) {
            alertController.f2247OooOOo.setVisibility(8);
            view = null;
        } else {
            alertController.f2247OooOOo.setText(alertController.f2249OooOOoo);
            Drawable drawable3 = alertController.f2251OooOo0;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i7, i7);
                view = null;
                alertController.f2247OooOOo.setCompoundDrawables(alertController.f2251OooOo0, null, null, null);
            } else {
                view = null;
            }
            alertController.f2247OooOOo.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                AlertController.OooO0O0(alertController.f2240OooOO0);
            } else if (i == 2) {
                AlertController.OooO0O0(alertController.f2243OooOOO);
            } else if (i == 4) {
                AlertController.OooO0O0(alertController.f2247OooOOo);
            }
        }
        if (!(i != 0)) {
            viewGroupOooO0OO3.setVisibility(8);
        }
        if (alertController.f2259OooOoo0 != null) {
            viewGroupOooO0OO.addView(alertController.f2259OooOoo0, 0, new ViewGroup.LayoutParams(-1, -2));
            i2 = 8;
            window.findViewById(p012OooOo0O.Oooo000.title_template).setVisibility(8);
        } else {
            alertController.f2256OooOoO0 = (ImageView) window.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f2237OooO0o0)) && alertController.f2262Oooo0) {
                TextView textView2 = (TextView) window.findViewById(p012OooOo0O.Oooo000.alertTitle);
                alertController.f2255OooOoO = textView2;
                textView2.setText(alertController.f2237OooO0o0);
                int i8 = alertController.f2254OooOo0o;
                if (i8 != 0) {
                    alertController.f2256OooOoO0.setImageResource(i8);
                } else {
                    Drawable drawable4 = alertController.f2250OooOo;
                    if (drawable4 != null) {
                        alertController.f2256OooOoO0.setImageDrawable(drawable4);
                    } else {
                        alertController.f2255OooOoO.setPadding(alertController.f2256OooOoO0.getPaddingLeft(), alertController.f2256OooOoO0.getPaddingTop(), alertController.f2256OooOoO0.getPaddingRight(), alertController.f2256OooOoO0.getPaddingBottom());
                        i2 = 8;
                        alertController.f2256OooOoO0.setVisibility(8);
                    }
                }
                i2 = 8;
            } else {
                i2 = 8;
                window.findViewById(p012OooOo0O.Oooo000.title_template).setVisibility(8);
                alertController.f2256OooOoO0.setVisibility(8);
                viewGroupOooO0OO.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != i2;
        int i9 = (viewGroupOooO0OO == null || viewGroupOooO0OO.getVisibility() == i2) ? 0 : 1;
        boolean z3 = viewGroupOooO0OO3.getVisibility() != i2;
        if (!z3 && (viewFindViewById = viewGroupOooO0OO2.findViewById(p012OooOo0O.Oooo000.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i9 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f2253OooOo0O;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = alertController.f2236OooO0o != null ? viewGroupOooO0OO.findViewById(p012OooOo0O.Oooo000.titleDividerNoCustom) : view;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupOooO0OO2.findViewById(p012OooOo0O.Oooo000.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f2236OooO0o;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z3 || i9 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i9 != 0 ? recycleListView.getPaddingTop() : recycleListView.f2285OooO0Oo, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f2286OooO0o0);
            }
        }
        if (!z2) {
            View view2 = alertController.f2236OooO0o;
            if (view2 == null) {
                view2 = alertController.f2253OooOo0O;
            }
            if (view2 != null) {
                int i10 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(p012OooOo0O.Oooo000.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(p012OooOo0O.Oooo000.scrollIndicatorDown);
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOOOO.OooO0Oo(view2, i9 | i10, 3);
                if (viewFindViewById11 != null) {
                    viewGroupOooO0OO2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupOooO0OO2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f2236OooO0o;
        if (recycleListView2 == null || (listAdapter = alertController.f2258OooOoo) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i11 = alertController.f2260OooOooO;
        if (i11 > -1) {
            recycleListView2.setItemChecked(i11, true);
            recycleListView2.setSelection(i11);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2393OooO0o.f2253OooOo0O;
        if (nestedScrollView != null && nestedScrollView.OooO0Oo(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f2393OooO0o.f2253OooOo0O;
        if (nestedScrollView != null && nestedScrollView.OooO0Oo(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.oo0o0Oo, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f2393OooO0o;
        alertController.f2237OooO0o0 = charSequence;
        TextView textView = alertController.f2255OooOoO;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
