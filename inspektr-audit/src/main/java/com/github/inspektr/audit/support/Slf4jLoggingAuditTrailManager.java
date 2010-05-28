/**
 * Copyright (C) 2009 Rutgers, the State University of New Jersey.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.inspektr.audit.support;

import com.github.inspektr.audit.AuditActionContext;
import com.github.inspektr.audit.AuditTrailManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>AuditTrailManager</code> that dumps auditable information to a configured logger.
 * 
 * @author Dmitriy Kopylenko
 * @version $Revision$ $Date$
 * @since 1.0
 * @see AuditTrailManager
 */
public final class Slf4jLoggingAuditTrailManager extends AbstractStringAuditTrailManager {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void record(final AuditActionContext auditActionContext) {

        log.info(toString(auditActionContext));
    }
}
