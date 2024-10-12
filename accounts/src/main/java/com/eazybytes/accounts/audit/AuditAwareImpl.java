package com.eazybytes.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    /**
     * @return
     */
    @Override
    public Optional getCurrentAuditor() {
        /**
         * TODO: replace this "ACC_MC" with the logged in User.
         */
        return Optional.of("ACC_MC");
    }
}
