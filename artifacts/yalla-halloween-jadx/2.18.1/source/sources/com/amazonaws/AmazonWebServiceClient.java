package com.amazonaws;

import OooO0o.OooO0OO;
import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
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
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceClient {
    private static final String AMAZON = "Amazon";
    private static final String AWS = "AWS";
    private static final Log LOG = LogFactory.OooO00o(AmazonWebServiceClient.class);
    public static final boolean LOGGING_AWS_REQUEST_METRIC = true;
    public AmazonHttpClient client;
    public ClientConfiguration clientConfiguration;
    public volatile URI endpoint;
    public volatile String endpointPrefix;
    private volatile Region region;
    public final List<RequestHandler2> requestHandler2s;
    private volatile String serviceName;
    private volatile Signer signer;
    private volatile String signerRegionOverride;
    public int timeOffset;

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.internal.config.HttpClientConfig>] */
    private String computeServiceName() {
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
        HttpClientConfig httpClientConfig = (HttpClientConfig) InternalConfig.Factory.f10424OooO00o.f10423OooO0o0.get(simpleName);
        String str = httpClientConfig != null ? httpClientConfig.f10416OooO00o : null;
        if (str != null) {
            return str;
        }
        int iIndexOf = simpleName.indexOf("JavaClient");
        if (iIndexOf == -1 && (iIndexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException(OooOo00.OooO0Oo("Unrecognized suffix for the AWS http client class name ", simpleName));
        }
        int iIndexOf2 = simpleName.indexOf(AMAZON);
        if (iIndexOf2 == -1) {
            iIndexOf2 = simpleName.indexOf(AWS);
            if (iIndexOf2 == -1) {
                throw new IllegalStateException(OooOo00.OooO0Oo("Unrecognized prefix for the AWS http client class name ", simpleName));
            }
            i = 3;
        } else {
            i = 6;
        }
        if (iIndexOf2 < iIndexOf) {
            return StringUtils.OooO00o(simpleName.substring(iIndexOf2 + i, iIndexOf));
        }
        throw new IllegalStateException(OooOo00.OooO0Oo("Unrecognized AWS http client class name ", simpleName));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.internal.config.SignerConfig>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.internal.config.SignerConfig>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.internal.config.SignerConfig>] */
    private Signer computeSignerByServiceRegion(String str, String str2, String str3, boolean z) {
        SignerConfig signerConfig;
        Objects.requireNonNull(this.clientConfiguration);
        Map<String, Class<? extends Signer>> map = SignerFactory.f10368OooO00o;
        InternalConfig internalConfig = InternalConfig.Factory.f10424OooO00o;
        Objects.requireNonNull(internalConfig);
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str2 != null) {
            signerConfig = (SignerConfig) internalConfig.f10419OooO0O0.get(OooO0OO.OooO00o(str, "/", str2));
            if (signerConfig == null && (signerConfig = (SignerConfig) internalConfig.f10420OooO0OO.get(str2)) == null) {
                signerConfig = (SignerConfig) internalConfig.f10421OooO0Oo.get(str);
                if (signerConfig == null) {
                    signerConfig = internalConfig.f10418OooO00o;
                }
            }
        } else {
            signerConfig = (SignerConfig) internalConfig.f10421OooO0Oo.get(str);
            if (signerConfig == null) {
                signerConfig = internalConfig.f10418OooO00o;
            }
        }
        Signer signerOooO00o = SignerFactory.OooO00o(signerConfig.f10425OooO00o, str);
        if (signerOooO00o instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signerOooO00o;
            if (str3 != null) {
                regionAwareSigner.OooO0OO(str3);
            } else if (str2 != null && z) {
                regionAwareSigner.OooO0OO(str2);
            }
        }
        synchronized (this) {
            this.region = RegionUtils.OooO00o(str2);
        }
        return signerOooO00o;
    }

    private Signer computeSignerByURI(URI uri, String str, boolean z) {
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String serviceNameIntern = getServiceNameIntern();
        return computeSignerByServiceRegion(serviceNameIntern, AwsHostNameUtils.OooO00o(uri.getHost(), serviceNameIntern), str, z);
    }

    @Deprecated
    public static boolean isProfilingEnabled() {
        return System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null;
    }

    @Deprecated
    private boolean isRMCEnabledAtClientOrSdkLevel() {
        requestMetricCollector();
        return false;
    }

    private URI toURI(String str) {
        if (!str.contains("://")) {
            str = this.clientConfiguration.f10282OooO0Oo.toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public void addRequestHandler(RequestHandler requestHandler) {
        this.requestHandler2s.add(RequestHandler2.OooO00o(requestHandler));
    }

    @Deprecated
    public void configSigner(String str, String str2) {
    }

    @Deprecated
    public void configSigner(URI uri) {
    }

    public ExecutionContext createExecutionContext(AmazonWebServiceRequest amazonWebServiceRequest) {
        return new ExecutionContext(this.requestHandler2s, isRequestMetricsEnabled(amazonWebServiceRequest) || isProfilingEnabled(), this);
    }

    @Deprecated
    public final void endClientExecution(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response) {
        endClientExecution(aWSRequestMetrics, request, response, false);
    }

    @Deprecated
    public final RequestMetricCollector findRequestMetricCollector(Request<?> request) {
        RequestMetricCollector requestMetricCollector = ((DefaultRequest) request).f10292OooO0oO.f10274Oooo0oo;
        if (requestMetricCollector != null) {
            return requestMetricCollector;
        }
        RequestMetricCollector requestMetricsCollector = getRequestMetricsCollector();
        return requestMetricsCollector == null ? AwsSdkMetrics.OooO0Oo() : requestMetricsCollector;
    }

    public String getEndpoint() {
        String string;
        synchronized (this) {
            string = this.endpoint.toString();
        }
        return string;
    }

    public String getEndpointPrefix() {
        return this.endpointPrefix;
    }

    public Regions getRegions() {
        Regions regionsOooO00o;
        synchronized (this) {
            regionsOooO00o = Regions.OooO00o(this.region.f10554OooO00o);
        }
        return regionsOooO00o;
    }

    @Deprecated
    public RequestMetricCollector getRequestMetricsCollector() {
        return this.client.f10385OooO0OO;
    }

    @Deprecated
    public String getServiceAbbreviation() {
        return getServiceNameIntern();
    }

    public String getServiceName() {
        return getServiceNameIntern();
    }

    public String getServiceNameIntern() {
        if (this.serviceName == null) {
            synchronized (this) {
                if (this.serviceName == null) {
                    this.serviceName = computeServiceName();
                    return this.serviceName;
                }
            }
        }
        return this.serviceName;
    }

    public Signer getSigner() {
        return this.signer;
    }

    public Signer getSignerByURI(URI uri) {
        return computeSignerByURI(uri, this.signerRegionOverride, true);
    }

    public final String getSignerRegionOverride() {
        return this.signerRegionOverride;
    }

    public int getTimeOffset() {
        return this.timeOffset;
    }

    @Deprecated
    public final boolean isRequestMetricsEnabled(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestMetricCollector requestMetricCollector = amazonWebServiceRequest.f10274Oooo0oo;
        return isRMCEnabledAtClientOrSdkLevel();
    }

    @Deprecated
    public void removeRequestHandler(RequestHandler requestHandler) {
        this.requestHandler2s.remove(RequestHandler2.OooO00o(requestHandler));
    }

    @Deprecated
    public RequestMetricCollector requestMetricCollector() {
        RequestMetricCollector requestMetricCollector = this.client.f10385OooO0OO;
        return requestMetricCollector == null ? AwsSdkMetrics.OooO0Oo() : requestMetricCollector;
    }

    @Deprecated
    public void setConfiguration(ClientConfiguration clientConfiguration) {
        RequestMetricCollector requestMetricCollector;
        AmazonHttpClient amazonHttpClient = this.client;
        if (amazonHttpClient != null) {
            requestMetricCollector = amazonHttpClient.f10385OooO0OO;
            amazonHttpClient.OooOO0O();
        } else {
            requestMetricCollector = null;
        }
        this.clientConfiguration = clientConfiguration;
        this.client = new AmazonHttpClient(clientConfiguration, requestMetricCollector);
    }

    public void setEndpoint(String str) {
        URI uri = toURI(str);
        Signer signerComputeSignerByURI = computeSignerByURI(uri, this.signerRegionOverride, false);
        synchronized (this) {
            this.endpoint = uri;
            this.signer = signerComputeSignerByURI;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public void setRegion(Region region) {
        String strSubstring;
        if (region == null) {
            throw new IllegalArgumentException("No region provided");
        }
        String serviceNameIntern = getServiceNameIntern();
        if (region.f10556OooO0OO.containsKey(serviceNameIntern)) {
            strSubstring = (String) region.f10556OooO0OO.get(serviceNameIntern);
            int iIndexOf = strSubstring.indexOf("://");
            if (iIndexOf >= 0) {
                strSubstring = strSubstring.substring(iIndexOf + 3);
            }
        } else {
            strSubstring = String.format("%s.%s.%s", getEndpointPrefix(), region.f10554OooO00o, region.f10555OooO0O0);
        }
        URI uri = toURI(strSubstring);
        Signer signerComputeSignerByServiceRegion = computeSignerByServiceRegion(serviceNameIntern, region.f10554OooO00o, this.signerRegionOverride, false);
        synchronized (this) {
            this.endpoint = uri;
            this.signer = signerComputeSignerByServiceRegion;
        }
    }

    public final void setServiceNameIntern(String str) {
        this.serviceName = str;
    }

    public final void setSignerRegionOverride(String str) {
        Signer signerComputeSignerByURI = computeSignerByURI(this.endpoint, str, true);
        synchronized (this) {
            this.signer = signerComputeSignerByURI;
            this.signerRegionOverride = str;
        }
    }

    public void setTimeOffset(int i) {
        this.timeOffset = i;
    }

    public void shutdown() {
        this.client.OooOO0O();
    }

    public AmazonWebServiceClient withTimeOffset(int i) {
        setTimeOffset(i);
        return this;
    }

    @Deprecated
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration), null);
    }

    public void addRequestHandler(RequestHandler2 requestHandler2) {
        this.requestHandler2s.add(requestHandler2);
    }

    @Deprecated
    public final void endClientExecution(AWSRequestMetrics aWSRequestMetrics, Request<?> request, Response<?> response, boolean z) {
        if (request != null) {
            aWSRequestMetrics.OooO0O0(AWSRequestMetrics.Field.ClientExecuteTime);
            aWSRequestMetrics.f11165OooO00o.OooO0O0();
            Objects.requireNonNull(findRequestMetricCollector(request));
        }
        if (z) {
            aWSRequestMetrics.OooO0Oo();
        }
    }

    public void removeRequestHandler(RequestHandler2 requestHandler2) {
        this.requestHandler2s.remove(requestHandler2);
    }

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.clientConfiguration = clientConfiguration;
        this.client = new AmazonHttpClient(clientConfiguration, httpClient);
        this.requestHandler2s = new CopyOnWriteArrayList();
    }

    public final ExecutionContext createExecutionContext(Request<?> request) {
        return createExecutionContext(((DefaultRequest) request).f10292OooO0oO);
    }

    @Deprecated
    public final ExecutionContext createExecutionContext() {
        return new ExecutionContext(this.requestHandler2s, isRMCEnabledAtClientOrSdkLevel() || isProfilingEnabled(), this);
    }

    @Deprecated
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, HttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this.clientConfiguration = clientConfiguration;
        this.client = new AmazonHttpClient(clientConfiguration, httpClient, requestMetricCollector);
        this.requestHandler2s = new CopyOnWriteArrayList();
    }

    @Deprecated
    public void setEndpoint(String str, String str2, String str3) {
        URI uri = toURI(str);
        Signer signerComputeSignerByServiceRegion = computeSignerByServiceRegion(str2, str3, str3, true);
        synchronized (this) {
            this.signer = signerComputeSignerByServiceRegion;
            this.endpoint = uri;
            this.signerRegionOverride = str3;
        }
    }
}
