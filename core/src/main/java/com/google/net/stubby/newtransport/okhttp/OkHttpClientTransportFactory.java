package com.google.net.stubby.newtransport.okhttp;

import com.google.net.stubby.newtransport.ClientTransport;
import com.google.net.stubby.newtransport.ClientTransportFactory;

/**
 * Factory that manufactures instances of {@link OkHttpClientTransport}.
 */
public class OkHttpClientTransportFactory implements ClientTransportFactory {
  private final String host;
  private final int port;

  public OkHttpClientTransportFactory(String host, int port) {
    this.host = host;
    this.port = port;
  }

  @Override
  public ClientTransport newClientTransport() {
    return new OkHttpClientTransport(host, port);
  }

}