package p060o0000o;

import OooO0o.OooO0o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p016OooOoO0.OooOo00;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends OooOOO0 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f27772OooOOo0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f27761OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f27760OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f27762OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f27763OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f27759OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f27764OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public View f27765OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27766OooOO0o = 0.1f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f27768OooOOO0 = true;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f27767OooOOO = true;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f27769OooOOOO = true;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f27770OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f27771OooOOo = false;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f27773OooOOoo = -1;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f27776OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f27775OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public RectF f27777OooOo0O = new RectF();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RectF f27778OooOo0o = new RectF();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HashMap<String, Method> f27774OooOo = new HashMap<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static SparseIntArray f27779OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f27779OooO00o = sparseIntArray;
            sparseIntArray.append(o000O00.KeyTrigger_framePosition, 8);
            f27779OooO00o.append(o000O00.KeyTrigger_onCross, 4);
            f27779OooO00o.append(o000O00.KeyTrigger_onNegativeCross, 1);
            f27779OooO00o.append(o000O00.KeyTrigger_onPositiveCross, 2);
            f27779OooO00o.append(o000O00.KeyTrigger_motionTarget, 7);
            f27779OooO00o.append(o000O00.KeyTrigger_triggerId, 6);
            f27779OooO00o.append(o000O00.KeyTrigger_triggerSlack, 5);
            f27779OooO00o.append(o000O00.KeyTrigger_motion_triggerOnCollision, 9);
            f27779OooO00o.append(o000O00.KeyTrigger_motion_postLayoutCollision, 10);
            f27779OooO00o.append(o000O00.KeyTrigger_triggerReceiver, 11);
            f27779OooO00o.append(o000O00.KeyTrigger_viewTransitionOnCross, 12);
            f27779OooO00o.append(o000O00.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f27779OooO00o.append(o000O00.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public o000oOoO() {
        this.f27707OooO0Oo = new HashMap<>();
    }

    public final void OooO(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f27774OooOo.containsKey(str)) {
                method = this.f27774OooOo.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f27774OooOo.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f27774OooOo.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO.OooO0Oo(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Exception in call \"");
                sbOooO0O0.append(this.f27761OooO0o0);
                sbOooO0O0.append("\"on class ");
                sbOooO0O0.append(view.getClass().getSimpleName());
                sbOooO0O0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                sbOooO0O0.append(OooO.OooO0Oo(view));
                Log.e("KeyTrigger", sbOooO0O0.toString());
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f27707OooO0Oo.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f27707OooO0Oo.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    String str3 = constraintAttribute.f7496OooO0O0;
                    String strOooO00o = !constraintAttribute.f7495OooO00o ? OooOo00.OooO00o("set", str3) : str3;
                    try {
                        switch (ConstraintAttribute.OooO00o.f7503OooO00o[constraintAttribute.f7497OooO0OO.ordinal()]) {
                            case 1:
                            case 6:
                                cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f7498OooO0Oo));
                                break;
                            case 2:
                                cls.getMethod(strOooO00o, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f7501OooO0oO));
                                break;
                            case 3:
                                cls.getMethod(strOooO00o, CharSequence.class).invoke(view, constraintAttribute.f7499OooO0o);
                                break;
                            case 4:
                                cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f7502OooO0oo));
                                break;
                            case 5:
                                Method method2 = cls.getMethod(strOooO00o, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f7502OooO0oo);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 7:
                                cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f7500OooO0o0));
                                break;
                            case 8:
                                cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f7500OooO0o0));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbOooO00o = OooO0o.OooO00o(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO00o.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO00o.toString());
                        e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", e2.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        StringBuilder sb = new StringBuilder();
                        sb.append(cls.getName());
                        sb.append(" must have a method ");
                        sb.append(strOooO00o);
                        Log.e("TransitionLayout", sb.toString());
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbOooO00o2 = OooO0o.OooO00o(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO00o2.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO00o2.toString());
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO00o(HashMap<String, oo0o0Oo> map) {
    }

    @Override // p060o0000o.OooOOO0
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooOOO0 clone() {
        o000oOoO o000oooo2 = new o000oOoO();
        super.OooO0OO(this);
        o000oooo2.f27761OooO0o0 = this.f27761OooO0o0;
        o000oooo2.f27760OooO0o = this.f27760OooO0o;
        o000oooo2.f27762OooO0oO = this.f27762OooO0oO;
        o000oooo2.f27763OooO0oo = this.f27763OooO0oo;
        o000oooo2.f27759OooO = this.f27759OooO;
        o000oooo2.f27764OooOO0 = this.f27764OooOO0;
        o000oooo2.f27765OooOO0O = this.f27765OooOO0O;
        o000oooo2.f27766OooOO0o = this.f27766OooOO0o;
        o000oooo2.f27768OooOOO0 = this.f27768OooOOO0;
        o000oooo2.f27767OooOOO = this.f27767OooOOO;
        o000oooo2.f27769OooOOOO = this.f27769OooOOOO;
        o000oooo2.f27770OooOOOo = this.f27770OooOOOo;
        o000oooo2.f27772OooOOo0 = this.f27772OooOOo0;
        o000oooo2.f27771OooOOo = this.f27771OooOOo;
        o000oooo2.f27777OooOo0O = this.f27777OooOo0O;
        o000oooo2.f27778OooOo0o = this.f27778OooOo0o;
        o000oooo2.f27774OooOo = this.f27774OooOo;
        return o000oooo2;
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0Oo(HashSet<String> hashSet) {
    }

    @Override // p060o0000o.OooOOO0
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.KeyTrigger);
        SparseIntArray sparseIntArray = OooO00o.f27779OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (OooO00o.f27779OooO00o.get(index)) {
                case 1:
                    this.f27762OooO0oO = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f27763OooO0oo = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("unused attribute 0x");
                    sbOooO0O0.append(Integer.toHexString(index));
                    sbOooO0O0.append("   ");
                    sbOooO0O0.append(OooO00o.f27779OooO00o.get(index));
                    Log.e("KeyTrigger", sbOooO0O0.toString());
                    break;
                case 4:
                    this.f27761OooO0o0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f27766OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f27766OooOO0o);
                    break;
                case 6:
                    this.f27759OooO = typedArrayObtainStyledAttributes.getResourceId(index, this.f27759OooO);
                    break;
                case 7:
                    if (MotionLayout.f7161o0000Oo) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f27705OooO0O0);
                        this.f27705OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f27706OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27706OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f27705OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27705OooO0O0);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f27704OooO00o);
                    this.f27704OooO00o = integer;
                    this.f27770OooOOOo = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f27764OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27764OooOO0);
                    break;
                case 10:
                    this.f27771OooOOo = typedArrayObtainStyledAttributes.getBoolean(index, this.f27771OooOOo);
                    break;
                case 11:
                    this.f27760OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f27760OooO0o);
                    break;
                case 12:
                    this.f27775OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27775OooOo0);
                    break;
                case 13:
                    this.f27773OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f27773OooOOoo);
                    break;
                case 14:
                    this.f27776OooOo00 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27776OooOo00);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dc A[PHI: r0 r5
      0x00dc: PHI (r0v11 boolean) = (r0v7 boolean), (r0v7 boolean), (r0v12 boolean) binds: [B:50:0x00c0, B:52:0x00c4, B:58:0x00db] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r5v13 boolean) = (r5v7 boolean), (r5v7 boolean), (r5v14 boolean) binds: [B:50:0x00c0, B:52:0x00c4, B:58:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooO0oo(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        boolean z4;
        float f4;
        float f5;
        if (this.f27764OooOO0 != -1) {
            if (this.f27765OooOO0O == null) {
                this.f27765OooOO0O = ((ViewGroup) view.getParent()).findViewById(this.f27764OooOO0);
            }
            OooOO0(this.f27777OooOo0O, this.f27765OooOO0O, this.f27771OooOOo);
            OooOO0(this.f27778OooOo0o, view, this.f27771OooOOo);
            if (this.f27777OooOo0O.intersect(this.f27778OooOo0o)) {
                if (this.f27768OooOOO0) {
                    this.f27768OooOOO0 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f27769OooOOOO) {
                    this.f27769OooOOOO = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f27767OooOOO = true;
                z2 = false;
            } else {
                if (this.f27768OooOOO0) {
                    z = false;
                } else {
                    this.f27768OooOOO0 = true;
                    z = true;
                }
                if (this.f27767OooOOO) {
                    this.f27767OooOOO = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f27769OooOOOO = true;
                z2 = z3;
                z4 = false;
            }
        } else {
            if (this.f27768OooOOO0) {
                float f6 = this.f27770OooOOOo;
                if ((this.f27772OooOOo0 - f6) * (f - f6) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f27768OooOOO0 = false;
                    z = true;
                }
                if (this.f27767OooOOO) {
                    f4 = this.f27770OooOOOo;
                    f5 = f - f4;
                    if ((this.f27772OooOOo0 - f4) * f5 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f5 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        this.f27767OooOOO = false;
                        z2 = true;
                    }
                    if (this.f27769OooOOOO) {
                        f2 = this.f27770OooOOOo;
                        f3 = f - f2;
                        if ((this.f27772OooOOo0 - f2) * f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f3 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            z4 = false;
                        } else {
                            this.f27769OooOOOO = false;
                            z4 = true;
                        }
                    } else {
                        if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                            this.f27769OooOOOO = true;
                        }
                        z3 = z2;
                        z2 = z3;
                        z4 = false;
                    }
                } else if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                    this.f27767OooOOO = true;
                }
                z2 = false;
                if (this.f27769OooOOOO) {
                    f2 = this.f27770OooOOOo;
                    f3 = f - f2;
                    if ((this.f27772OooOOo0 - f2) * f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                } else {
                    if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                        this.f27769OooOOOO = true;
                    }
                    z3 = z2;
                    z2 = z3;
                    z4 = false;
                }
            } else if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                this.f27768OooOOO0 = true;
            }
            z = false;
            if (this.f27767OooOOO) {
                f4 = this.f27770OooOOOo;
                f5 = f - f4;
                if ((this.f27772OooOOo0 - f4) * f5 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                }
                if (this.f27769OooOOOO) {
                    f2 = this.f27770OooOOOo;
                    f3 = f - f2;
                    if ((this.f27772OooOOo0 - f2) * f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                } else {
                    if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                        this.f27769OooOOOO = true;
                    }
                    z3 = z2;
                    z2 = z3;
                    z4 = false;
                }
            } else if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                this.f27767OooOOO = true;
            }
            z2 = false;
            if (this.f27769OooOOOO) {
                f2 = this.f27770OooOOOo;
                f3 = f - f2;
                if ((this.f27772OooOOo0 - f2) * f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    z4 = false;
                } else {
                    z4 = false;
                }
            } else {
                if (Math.abs(f - this.f27770OooOOOo) > this.f27766OooOO0o) {
                    this.f27769OooOOOO = true;
                }
                z3 = z2;
                z2 = z3;
                z4 = false;
            }
        }
        this.f27772OooOOo0 = f;
        if (z2 || z || z4) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.OooOOOO oooOOOO = motionLayout.f7180OoooooO;
            if (oooOOOO != null) {
                oooOOOO.OooO0Oo();
            }
            CopyOnWriteArrayList<MotionLayout.OooOOOO> copyOnWriteArrayList = motionLayout.f7225oo0o0Oo;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.OooOOOO> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().OooO0Oo();
                }
            }
        }
        View viewFindViewById = this.f27760OooO0o == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f27760OooO0o);
        if (z2) {
            String str = this.f27762OooO0oO;
            if (str != null) {
                OooO(str, viewFindViewById);
            }
            if (this.f27773OooOOoo != -1) {
                ((MotionLayout) view.getParent()).OooOoo(this.f27773OooOOoo, viewFindViewById);
            }
        }
        if (z4) {
            String str2 = this.f27763OooO0oo;
            if (str2 != null) {
                OooO(str2, viewFindViewById);
            }
            if (this.f27776OooOo00 != -1) {
                ((MotionLayout) view.getParent()).OooOoo(this.f27776OooOo00, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f27761OooO0o0;
            if (str3 != null) {
                OooO(str3, viewFindViewById);
            }
            if (this.f27775OooOo0 != -1) {
                ((MotionLayout) view.getParent()).OooOoo(this.f27775OooOo0, viewFindViewById);
            }
        }
    }

    public final void OooOO0(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
