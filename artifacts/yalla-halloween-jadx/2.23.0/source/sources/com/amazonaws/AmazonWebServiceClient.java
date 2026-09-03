package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.ServiceAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.config.HttpClientConfig;
import com.amazonaws.internal.config.InternalConfig;
import com.amazonaws.internal.config.SignerConfig;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AmazonWebServiceClient {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Log f8953OooO = LogFactory.OooO00o(AmazonWebServiceClient.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile URI f8954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ClientConfiguration f8955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AmazonHttpClient f8956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CopyOnWriteArrayList f8957OooO0Oo = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile String f8958OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Signer f8959OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile String f8960OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile Region f8961OooO0oo;

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f8955OooO0O0 = clientConfiguration;
        this.f8956OooO0OO = new AmazonHttpClient(clientConfiguration, urlHttpClient);
    }

    @Deprecated
    public final void OooO(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest, boolean z) {
        if (defaultRequest != null) {
            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
            aWSRequestMetrics.f9568OooO00o.OooO0O0();
            RequestMetricCollector requestMetricCollectorOooO0OO = defaultRequest.f8982OooO0oO.f8963OooO0o;
            if (requestMetricCollectorOooO0OO == null) {
                this.f8956OooO0OO.getClass();
                requestMetricCollectorOooO0OO = AwsSdkMetrics.OooO0OO();
            }
            requestMetricCollectorOooO0OO.getClass();
        }
        if (z) {
            aWSRequestMetrics.OooO0Oo();
        }
    }

    public final String OooO0oO() {
        Class<?> cls;
        int i;
        if (this != Object.class && !AmazonWebServiceClient.class.isInterface()) {
            cls = getClass();
            while (true) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == AmazonWebServiceClient.class) {
                    break;
                }
                if (superclass == null) {
                    cls = null;
                    break;
                }
                cls = superclass;
            }
        } else {
            cls = null;
            break;
        }
        String simpleName = cls.getSimpleName();
        HttpClientConfig httpClientConfig = (HttpClientConfig) InternalConfig.Factory.f9118OooO00o.f9117OooO0o0.get(simpleName);
        String str = httpClientConfig != null ? httpClientConfig.f9110OooO00o : null;
        if (str != null) {
            return str;
        }
        int iIndexOf = simpleName.indexOf("JavaClient");
        if (iIndexOf == -1 && (iIndexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name ".concat(simpleName));
        }
        int iIndexOf2 = simpleName.indexOf("Amazon");
        if (iIndexOf2 == -1) {
            iIndexOf2 = simpleName.indexOf("AWS");
            if (iIndexOf2 == -1) {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name ".concat(simpleName));
            }
            i = 3;
        } else {
            i = 6;
        }
        if (iIndexOf2 < iIndexOf) {
            return StringUtils.OooO00o(simpleName.substring(iIndexOf2 + i, iIndexOf));
        }
        throw new IllegalStateException("Unrecognized AWS http client class name ".concat(simpleName));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final Signer OooO0oo(String str, String str2, boolean z) {
        SignerConfig signerConfig;
        this.f8955OooO0O0.getClass();
        ConcurrentHashMap concurrentHashMap = SignerFactory.f9063OooO00o;
        InternalConfig internalConfig = InternalConfig.Factory.f9118OooO00o;
        internalConfig.getClass();
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str2 != null) {
            signerConfig = (SignerConfig) internalConfig.f9113OooO0O0.get(o0OoOo0.OooO00o(str, "/", str2));
            if (signerConfig == null && (signerConfig = (SignerConfig) internalConfig.f9114OooO0OO.get(str2)) == null) {
                signerConfig = (SignerConfig) internalConfig.f9115OooO0Oo.get(str);
                if (signerConfig == null) {
                    signerConfig = internalConfig.f9112OooO00o;
                }
            }
        } else {
            signerConfig = (SignerConfig) internalConfig.f9115OooO0Oo.get(str);
            if (signerConfig == null) {
                signerConfig = internalConfig.f9112OooO00o;
            }
        }
        Class cls = (Class) SignerFactory.f9063OooO00o.get(signerConfig.f9119OooO00o);
        if (cls == null) {
            throw new IllegalArgumentException();
        }
        try {
            Signer signer = (Signer) cls.newInstance();
            if (signer instanceof ServiceAwareSigner) {
                ((ServiceAwareSigner) signer).OooO00o(str);
            }
            if (signer instanceof RegionAwareSigner) {
                RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer;
                if (str2 != null && z) {
                    regionAwareSigner.OooO0O0(str2);
                }
            }
            synchronized (this) {
                this.f8961OooO0oo = RegionUtils.OooO00o(str2);
            }
            return signer;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Cannot create an instance of ".concat(cls.getName()), e2);
        }
    }

    public final String OooOO0() {
        if (this.f8958OooO0o == null) {
            synchronized (this) {
                if (this.f8958OooO0o == null) {
                    this.f8958OooO0o = OooO0oO();
                    return this.f8958OooO0o;
                }
            }
        }
        return this.f8958OooO0o;
    }

    public void OooOO0O(Region region) {
        String strSubstring;
        if (region == null) {
            throw new IllegalArgumentException("No region provided");
        }
        String strOooOO0 = OooOO0();
        if (region.f9236OooO0OO.containsKey(strOooOO0)) {
            strSubstring = (String) region.f9236OooO0OO.get(strOooOO0);
            int iIndexOf = strSubstring.indexOf("://");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(iIndexOf + 3);
            }
        } else {
            strSubstring = String.format("%s.%s.%s", this.f8960OooO0oO, region.f9234OooO00o, region.f9235OooO0O0);
        }
        URI uriOooOO0o = OooOO0o(strSubstring);
        Signer signerOooO0oo = OooO0oo(strOooOO0, region.f9234OooO00o, false);
        synchronized (this) {
            this.f8954OooO00o = uriOooOO0o;
            this.f8959OooO0o0 = signerOooO0oo;
        }
    }

    public final URI OooOO0o(String str) {
        if (!str.contains("://")) {
            str = this.f8955OooO0O0.f8972OooO0Oo.toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
