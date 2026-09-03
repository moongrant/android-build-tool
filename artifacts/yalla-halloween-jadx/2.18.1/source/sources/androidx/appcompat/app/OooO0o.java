package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends Oooo000 {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final AlertController f4517OoooO00;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AlertController.OooO0O0 f4518OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f4519OooO0O0;

        public OooO00o(@NonNull Context context) {
            int iOooOO0 = OooO0o.OooOO0(context, 0);
            this.f4518OooO00o = new AlertController.OooO0O0(new ContextThemeWrapper(context, OooO0o.OooOO0(context, iOooOO0)));
            this.f4519OooO0O0 = iOooOO0;
        }

        @NonNull
        public final OooO0o OooO00o() {
            OooO0o oooO0o = new OooO0o(this.f4518OooO00o.f4403OooO00o, this.f4519OooO0O0);
            AlertController.OooO0O0 oooO0O0 = this.f4518OooO00o;
            AlertController alertController = oooO0o.f4517OoooO00;
            View view = oooO0O0.f4408OooO0o0;
            if (view != null) {
                alertController.f4390OooOoo0 = view;
            } else {
                CharSequence charSequence = oooO0O0.f4406OooO0Oo;
                if (charSequence != null) {
                    alertController.f4368OooO0o0 = charSequence;
                    TextView textView = alertController.f4386OooOoO;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = oooO0O0.f4405OooO0OO;
                if (drawable != null) {
                    alertController.f4381OooOo = drawable;
                    alertController.f4385OooOo0o = 0;
                    ImageView imageView = alertController.f4387OooOoO0;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f4387OooOoO0.setImageDrawable(drawable);
                    }
                }
            }
            if (oooO0O0.f4409OooO0oO != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) oooO0O0.f4404OooO0O0.inflate(alertController.f4395Oooo00O, (ViewGroup) null);
                int i = oooO0O0.f4411OooOO0 ? alertController.f4393Oooo0 : alertController.f4397Oooo0O0;
                ListAdapter oooO0o2 = oooO0O0.f4409OooO0oO;
                if (oooO0o2 == null) {
                    oooO0o2 = new AlertController.OooO0o(oooO0O0.f4403OooO00o, i);
                }
                alertController.f4389OooOoo = oooO0o2;
                alertController.f4391OooOooO = oooO0O0.f4412OooOO0O;
                if (oooO0O0.f4410OooO0oo != null) {
                    recycleListView.setOnItemClickListener(new OooO0OO(oooO0O0, alertController));
                }
                if (oooO0O0.f4411OooOO0) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f4367OooO0o = recycleListView;
            }
            View view2 = oooO0O0.f4402OooO;
            if (view2 != null) {
                alertController.f4369OooO0oO = view2;
                alertController.f4370OooO0oo = 0;
                alertController.f4362OooO = false;
            }
            Objects.requireNonNull(this.f4518OooO00o);
            oooO0o.setCancelable(true);
            Objects.requireNonNull(this.f4518OooO00o);
            oooO0o.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f4518OooO00o);
            oooO0o.setOnCancelListener(null);
            Objects.requireNonNull(this.f4518OooO00o);
            oooO0o.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f4518OooO00o.f4407OooO0o;
            if (onKeyListener != null) {
                oooO0o.setOnKeyListener(onKeyListener);
            }
            return oooO0o;
        }
    }

    public OooO0o(@NonNull Context context, @StyleRes int i) {
        super(context, OooOO0(context, i));
        this.f4517OoooO00 = new AlertController(getContext(), this, getWindow());
    }

    public static int OooOO0(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OooOo00.OooO00o.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.Oooo000, androidx.activity.OooOOO0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f4517OoooO00;
        alertController.f4364OooO0O0.setContentView(alertController.f4394Oooo000 == 0 ? alertController.f4392OooOooo : alertController.f4392OooOooo);
        View viewFindViewById2 = alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.parentPanel);
        int i2 = OooOo00.OooOO0.topPanel;
        View viewFindViewById3 = viewFindViewById2.findViewById(i2);
        int i3 = OooOo00.OooOO0.contentPanel;
        View viewFindViewById4 = viewFindViewById2.findViewById(i3);
        int i4 = OooOo00.OooOO0.buttonPanel;
        View viewFindViewById5 = viewFindViewById2.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(OooOo00.OooOO0.customPanel);
        View viewInflate = alertController.f4369OooO0oO;
        View view = null;
        if (viewInflate == null) {
            viewInflate = alertController.f4370OooO0oo != 0 ? LayoutInflater.from(alertController.f4363OooO00o).inflate(alertController.f4370OooO0oo, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.OooO00o(viewInflate)) {
            alertController.f4365OooO0OO.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f4362OooO) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f4367OooO0o != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(i2);
        View viewFindViewById7 = viewGroup.findViewById(i3);
        View viewFindViewById8 = viewGroup.findViewById(i4);
        ViewGroup viewGroupOooO0Oo = alertController.OooO0Oo(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupOooO0Oo2 = alertController.OooO0Oo(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupOooO0Oo3 = alertController.OooO0Oo(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.scrollView);
        alertController.f4384OooOo0O = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f4384OooOo0O.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupOooO0Oo2.findViewById(R.id.message);
        alertController.f4388OooOoOO = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f4384OooOo0O.removeView(alertController.f4388OooOoOO);
            if (alertController.f4367OooO0o != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f4384OooOo0O.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(alertController.f4384OooOo0O);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(alertController.f4367OooO0o, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupOooO0Oo2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupOooO0Oo3.findViewById(R.id.button1);
        alertController.f4371OooOO0 = button;
        button.setOnClickListener(alertController.f4399Oooo0o);
        if (TextUtils.isEmpty(alertController.f4372OooOO0O) && alertController.f4375OooOOO0 == null) {
            alertController.f4371OooOO0.setVisibility(8);
            i = 0;
        } else {
            alertController.f4371OooOO0.setText(alertController.f4372OooOO0O);
            Drawable drawable = alertController.f4375OooOOO0;
            if (drawable != null) {
                int i5 = alertController.f4366OooO0Oo;
                drawable.setBounds(0, 0, i5, i5);
                alertController.f4371OooOO0.setCompoundDrawables(alertController.f4375OooOOO0, null, null, null);
            }
            alertController.f4371OooOO0.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupOooO0Oo3.findViewById(R.id.button2);
        alertController.f4374OooOOO = button2;
        button2.setOnClickListener(alertController.f4399Oooo0o);
        if (TextUtils.isEmpty(alertController.f4376OooOOOO) && alertController.f4379OooOOo0 == null) {
            alertController.f4374OooOOO.setVisibility(8);
        } else {
            alertController.f4374OooOOO.setText(alertController.f4376OooOOOO);
            Drawable drawable2 = alertController.f4379OooOOo0;
            if (drawable2 != null) {
                int i6 = alertController.f4366OooO0Oo;
                drawable2.setBounds(0, 0, i6, i6);
                alertController.f4374OooOOO.setCompoundDrawables(alertController.f4379OooOOo0, null, null, null);
            }
            alertController.f4374OooOOO.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupOooO0Oo3.findViewById(R.id.button3);
        alertController.f4378OooOOo = button3;
        button3.setOnClickListener(alertController.f4399Oooo0o);
        if (TextUtils.isEmpty(alertController.f4380OooOOoo) && alertController.f4382OooOo0 == null) {
            alertController.f4378OooOOo.setVisibility(8);
        } else {
            alertController.f4378OooOOo.setText(alertController.f4380OooOOoo);
            Drawable drawable3 = alertController.f4382OooOo0;
            if (drawable3 != null) {
                int i7 = alertController.f4366OooO0Oo;
                drawable3.setBounds(0, 0, i7, i7);
                alertController.f4378OooOOo.setCompoundDrawables(alertController.f4382OooOo0, null, null, null);
            }
            alertController.f4378OooOOo.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f4363OooO00o;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(OooOo00.OooO00o.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                alertController.OooO0O0(alertController.f4371OooOO0);
            } else if (i == 2) {
                alertController.OooO0O0(alertController.f4374OooOOO);
            } else if (i == 4) {
                alertController.OooO0O0(alertController.f4378OooOOo);
            }
        }
        if (!(i != 0)) {
            viewGroupOooO0Oo3.setVisibility(8);
        }
        if (alertController.f4390OooOoo0 != null) {
            viewGroupOooO0Oo.addView(alertController.f4390OooOoo0, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.title_template).setVisibility(8);
        } else {
            alertController.f4387OooOoO0 = (ImageView) alertController.f4365OooO0OO.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f4368OooO0o0)) && alertController.f4398Oooo0OO) {
                TextView textView2 = (TextView) alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.alertTitle);
                alertController.f4386OooOoO = textView2;
                textView2.setText(alertController.f4368OooO0o0);
                int i8 = alertController.f4385OooOo0o;
                if (i8 != 0) {
                    alertController.f4387OooOoO0.setImageResource(i8);
                } else {
                    Drawable drawable4 = alertController.f4381OooOo;
                    if (drawable4 != null) {
                        alertController.f4387OooOoO0.setImageDrawable(drawable4);
                    } else {
                        alertController.f4386OooOoO.setPadding(alertController.f4387OooOoO0.getPaddingLeft(), alertController.f4387OooOoO0.getPaddingTop(), alertController.f4387OooOoO0.getPaddingRight(), alertController.f4387OooOoO0.getPaddingBottom());
                        alertController.f4387OooOoO0.setVisibility(8);
                    }
                }
            } else {
                alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.title_template).setVisibility(8);
                alertController.f4387OooOoO0.setVisibility(8);
                viewGroupOooO0Oo.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i9 = (viewGroupOooO0Oo == null || viewGroupOooO0Oo.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupOooO0Oo3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupOooO0Oo2.findViewById(OooOo00.OooOO0.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i9 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f4384OooOo0O;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = alertController.f4367OooO0o != null ? viewGroupOooO0Oo.findViewById(OooOo00.OooOO0.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupOooO0Oo2.findViewById(OooOo00.OooOO0.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f4367OooO0o;
        if (recycleListView instanceof AlertController.RecycleListView) {
            Objects.requireNonNull(recycleListView);
            if (!z3 || i9 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i9 != 0 ? recycleListView.getPaddingTop() : recycleListView.f4414Oooo0o, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f4415Oooo0oO);
            }
        }
        if (!z2) {
            View view2 = alertController.f4367OooO0o;
            if (view2 == null) {
                view2 = alertController.f4384OooOo0O;
            }
            if (view2 != null) {
                int i10 = i9 | (z3 ? 2 : 0);
                View viewFindViewById11 = alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.scrollIndicatorUp);
                View viewFindViewById12 = alertController.f4365OooO0OO.findViewById(OooOo00.OooOO0.scrollIndicatorDown);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    if (i11 >= 23) {
                        ViewCompat.OooOOOO.OooO0Oo(view2, i10, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupOooO0Oo2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupOooO0Oo2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i10 & 1) == 0) {
                        viewGroupOooO0Oo2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 == null || (i10 & 2) != 0) {
                        view = viewFindViewById12;
                    } else {
                        viewGroupOooO0Oo2.removeView(viewFindViewById12);
                    }
                    if (viewFindViewById11 != null || view != null) {
                        AlertController.RecycleListView recycleListView2 = alertController.f4367OooO0o;
                        if (recycleListView2 != null) {
                            recycleListView2.setOnScrollListener(new androidx.appcompat.app.OooO00o(viewFindViewById11, view));
                            alertController.f4367OooO0o.post(new OooO0O0(alertController, viewFindViewById11, view));
                        } else {
                            if (viewFindViewById11 != null) {
                                viewGroupOooO0Oo2.removeView(viewFindViewById11);
                            }
                            if (view != null) {
                                viewGroupOooO0Oo2.removeView(view);
                            }
                        }
                    }
                }
            }
        }
        AlertController.RecycleListView recycleListView3 = alertController.f4367OooO0o;
        if (recycleListView3 == null || (listAdapter = alertController.f4389OooOoo) == null) {
            return;
        }
        recycleListView3.setAdapter(listAdapter);
        int i12 = alertController.f4391OooOooO;
        if (i12 > -1) {
            recycleListView3.setItemChecked(i12, true);
            recycleListView3.setSelection(i12);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4517OoooO00.f4384OooOo0O;
        if (nestedScrollView != null && nestedScrollView.OooO0oO(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4517OoooO00.f4384OooOo0O;
        if (nestedScrollView != null && nestedScrollView.OooO0oO(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.Oooo000, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f4517OoooO00;
        alertController.f4368OooO0o0 = charSequence;
        TextView textView = alertController.f4386OooOoO;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
